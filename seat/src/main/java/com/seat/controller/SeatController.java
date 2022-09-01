package com.seat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seat.model.Seat;
import com.seat.service.SeatService;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	private SeatService seatService;
	
	@PostMapping("/save")
	public ResponseEntity<Seat> saveSeat(@RequestBody Seat seat){
		return new ResponseEntity<Seat>(seatService.saveSeat(seat),HttpStatus.CREATED);		
	}
	
	@GetMapping("/get")
	public List<Seat> getSeats(){
		return seatService.getAllSeats();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Seat> getSeat(@PathVariable("id") Long Id){
		return new ResponseEntity<Seat>(seatService.getSeatById(Id),HttpStatus.CREATED);		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Seat> updateSeat(@PathVariable("id") Long Id,@RequestBody Seat seat){
		return new ResponseEntity<Seat>(seatService.updateSeat(seat, Id),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteSeat(@PathVariable("id") Long Id){
		seatService.deleteSeat(Id);
		return new ResponseEntity<String>("Seat deleted...", HttpStatus.OK);
	}
	
}
