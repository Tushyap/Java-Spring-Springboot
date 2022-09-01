package com.seat.seatRepo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.seat.repository.SeatRepository;

@SpringBootTest
class SeatRepoTest {

	@Autowired
	private SeatRepository seatRepository;
	

	@Test
	void isSeatExists() {
		seatRepository.findById(1l).get();
		Boolean actualResult =seatRepository.isSeatExists(1l);
		assertThat(actualResult).isTrue();
	}
}
