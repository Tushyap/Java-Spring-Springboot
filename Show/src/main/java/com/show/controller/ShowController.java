package com.show.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.show.entity.BookingState;
import com.show.entity.Movie;
import com.show.entity.Seat;
import com.show.entity.Show;
import com.show.entity.ShowTb;
import com.show.service.ShowService;

@RestController
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private ShowService showService;

	@Autowired
	private RestTemplate restTemplate;

	// post data to  database 
	@PostMapping("/save")
	public Show saveShow(@RequestBody Show show) {

		ShowTb showTemp = new ShowTb();
		showTemp.setShowStartTime(show.getShowStartTime());
		showTemp.setShowEndTime(show.getShowEndTime());
		List<Long> list = new ArrayList<Long>();
		for (Seat seat : show.getSeats()) {
			list.add(seat.getSeatId());
		}
		showTemp.setseatIds(list);
		showTemp.setShowName(show.getShowName());
		showTemp.setmovieId(show.getMovieName().getMovieId());
		showTemp.setScreenId(show.getScreenId());
		showTemp.setTheaterId(show.getTheaterId());
		showTemp = showService.saveShow(showTemp);
		show.setShowId(showTemp.getShowId());
		return show;
	}

	// get all data from database using http request
	@GetMapping("/get")
	public List<Show> showShow() {
		List<ShowTb> list = showService.getAllShow();
		List<Show> listTwo = new ArrayList<Show>();
		for (ShowTb temp : list) {
			Show show = new Show();
			show.setShowId(temp.getShowId());
			show.setShowStartTime(temp.getShowStartTime());
			show.setShowEndTime(temp.getShowEndTime());
			for (Long showObject : temp.getseatIds()) {
				show.getSeats()
						.add(restTemplate.getForObject("http://localhost:5050/seat/get/" + showObject, Seat.class));
			}

			show.setShowName(temp.getShowName());
			show.setMovieName(
					restTemplate.getForObject("http://localhost:5055/movie/get/" + temp.getmovieId(), Movie.class));
			show.setScreenId(temp.getScreenId());
			show.setTheaterId(temp.getTheaterId());

			listTwo.add(show);
		}
		return listTwo;
	}

	// get specific data from database using Id
	@GetMapping("/get/{id}")
	public Show getShowById(@PathVariable("id") Long Id) {
		ShowTb showTemp = showService.getShow(Id);
		Show showObj = new Show();
		showObj.setShowId(showTemp.getShowId());
		showObj.setShowStartTime(showTemp.getShowStartTime());
		showObj.setShowEndTime(showTemp.getShowEndTime());
		for (Long showObject : showTemp.getseatIds()) {
			showObj.getSeats()
					.add(restTemplate.getForObject("http://localhost:8999/seat/get/" + showObject, Seat.class));
		}
		showObj.setShowName(showTemp.getShowName());
		showObj.setMovieName(
				restTemplate.getForObject("http://localhost:8999/movie/get/" + showTemp.getmovieId(), Movie.class));
		showObj.setScreenId(showTemp.getScreenId());
		showObj.setTheaterId(showTemp.getTheaterId());
		return showObj;
	}
	// update details of specific data 
    @PutMapping("/update/{id}")
    public Show updateShowById(@PathVariable("id") Long Id,@RequestBody Show show) {
    	ShowTb showTemp=new ShowTb();
    	showTemp.setShowId(show.getShowId());
		showTemp.setShowStartTime(show.getShowStartTime());
		showTemp.setShowEndTime(show.getShowEndTime());
		List<Long> list=new ArrayList<Long>();
		for(Seat seat:show.getSeats()) {
			list.add(seat.getSeatId());
			restTemplate.put("http://localhost:5050/seat/update/"+seat.getSeatId(), seat, Seat.class);
		}		
		showTemp.setseatIds(list);
		showTemp.setShowName(show.getShowName());		
		restTemplate.put("http://localhost:5055/movie/update/"+show.getMovieName().getMovieId(), show.getMovieName(), Movie.class);
		showTemp.setmovieId(show.getMovieName().getMovieId());
		showTemp.setScreenId(show.getScreenId());
		showTemp.setTheaterId(show.getTheaterId());
		showTemp=showService.updateShow(showTemp);		
		return restTemplate.getForObject("http://localhost:8113/show/get/"+showTemp.getShowId(),Show.class);
    	
    }
    
    // delete data  from database table
    @DeleteMapping("/delete/{id}")
    public String deleteShowDetails(@PathVariable("id") Long Id) {
    	ShowTb showTb=showService.getShow(Id);
		for(Long id:showTb.getseatIds()) {
			Seat temp=restTemplate.getForObject("http://localhost:5050/seat/get/"+id, Seat.class);
			temp.setSeatStatus(BookingState.AVAILABLE);
			restTemplate.put("http://localhost:5050/seat/update/"+temp.getSeatId(), temp, Seat.class);
		}
    	return showService.deleteShow(showTb);
    }
}
