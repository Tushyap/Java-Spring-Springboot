package com.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.schedule.entity.Airport;
import com.schedule.entity.Schedule;
import com.schedule.entity.ScheduleRequestResponse;
import com.schedule.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;
	@Autowired
	private RestTemplate restTemplate;

	public ScheduleController(ScheduleService scheduleService) {
		super();
		this.scheduleService = scheduleService;
	}

	@PostMapping("/save")
	public ScheduleRequestResponse saveSchedule(@RequestBody ScheduleRequestResponse scheduleRequestResponse) {
		Airport sourceAirport = new Airport();
		Airport destinationAirport = new Airport();

		sourceAirport = restTemplate.postForObject("http://localhost:8000/airport/save",
				scheduleRequestResponse.getSourceAirport(), Airport.class);

		destinationAirport = restTemplate.postForObject("http://localhost:8000/airport/save",
				scheduleRequestResponse.getDestinationAirport(), Airport.class);

		Schedule schedule = new Schedule();
		schedule.setSourceAirportId(sourceAirport.getAirportId());
		schedule.setDestinationAirportId(destinationAirport.getAirportId());
		schedule.setArrivalTime(scheduleRequestResponse.getArrivalTime());
		schedule.setDepartureTime(scheduleRequestResponse.getDepartureTime());

		schedule = scheduleService.saveSchedule(schedule);
		return new ScheduleRequestResponse(schedule.getScheduleId(), sourceAirport, destinationAirport,
				schedule.getArrivalTime(), schedule.getDepartureTime());
	}

	@GetMapping("/get/{Id}")
	public ScheduleRequestResponse getAllSchedule(@PathVariable("Id") Long id) {
		Airport sourceAirport = new Airport();
		Airport destinationAirport = new Airport();
		Schedule schedule = scheduleService.getSchedule(id);
		sourceAirport = restTemplate.getForObject("http://localhost:8000/airport/show/" + schedule.getSourceAirportId(),
				Airport.class);

		destinationAirport = restTemplate.getForObject(
				"http://localhost:8000/airport/show/" + schedule.getDestinationAirportId(), Airport.class);

		return new ScheduleRequestResponse(schedule.getScheduleId(), sourceAirport, destinationAirport,
				schedule.getArrivalTime(), schedule.getDepartureTime());
	}

	@PutMapping("/update/{id}")
	public ScheduleRequestResponse saveSchedule(@PathVariable("id") Long id,
			@RequestBody ScheduleRequestResponse scheduleRequestResponse) {
		Airport sourceAirport = new Airport();
		Airport destinationAirport = new Airport();
		Schedule schedule = scheduleService.getSchedule(id);
		restTemplate.put("http://localhost:8000/airport/update/" + schedule.getSourceAirportId(),
				scheduleRequestResponse.getSourceAirport(), Airport.class);
		sourceAirport = restTemplate.getForObject("http://localhost:8000/airport/show/" + schedule.getSourceAirportId(),
				Airport.class);
		restTemplate.put("http://localhost:8000/airport/update/" + schedule.getDestinationAirportId(),
				scheduleRequestResponse.getDestinationAirport(), Airport.class);
		destinationAirport = restTemplate.getForObject(
				"http://localhost:8000/airport/show/" + schedule.getDestinationAirportId(), Airport.class);
		Schedule schedule_t = new Schedule();
		schedule_t.setScheduleId(id);
		schedule_t.setSourceAirportId(sourceAirport.getAirportId());
		schedule_t.setDestinationAirportId(destinationAirport.getAirportId());
		schedule_t.setArrivalTime(scheduleRequestResponse.getArrivalTime());
		schedule_t.setDepartureTime(scheduleRequestResponse.getDepartureTime());

		schedule = scheduleService.updateSchedule(schedule_t);
		return new ScheduleRequestResponse(schedule.getScheduleId(), sourceAirport, destinationAirport,
				schedule.getArrivalTime(), schedule.getDepartureTime());
	}

	@DeleteMapping("/delete/{id}")
	public String deleteSchedule(@PathVariable("id") Long id) {

		Schedule schedule = scheduleService.getSchedule(id);
		restTemplate.delete("http://localhost:8000/airport/delete/" + schedule.getSourceAirportId());
		restTemplate.delete("http://localhost:8000/airport/delete/" + schedule.getDestinationAirportId());
		scheduleService.deleteSchedule(schedule);
		return "Schedule record deleted";
	}
}
