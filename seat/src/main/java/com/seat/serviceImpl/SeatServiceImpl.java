package com.seat.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seat.exception.ResourceNotFoundException;
import com.seat.model.Seat;
import com.seat.repository.SeatRepository;
import com.seat.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService{

	@Autowired
	private SeatRepository seatRepository;
	
	@Override
	public Seat saveSeat(Seat seat) {
		return seatRepository.save(seat);
	}

	@Override
	public List<Seat> getAllSeats() {	
		return seatRepository.findAll();
	}

	@Override
	public Seat getSeatById(Long Id) {
		return seatRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Seat","seatId",Id));
	}

	@Override
	public Seat updateSeat(Seat seat, Long Id) {
		Seat existingSeat = seatRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Seat","seatId",Id));
		existingSeat.setSeatPrice(seat.getSeatPrice());
		existingSeat.setSeatStatus(seat.getSeatStatus());
		seatRepository.save(existingSeat);
		return existingSeat;
	}

	@Override
	public void deleteSeat(Long Id) {
		Seat existSeat = seatRepository.findById(Id).orElseThrow(
				()-> new ResourceNotFoundException("Seat","seatId",Id));
		seatRepository.delete(existSeat);
	}

}
