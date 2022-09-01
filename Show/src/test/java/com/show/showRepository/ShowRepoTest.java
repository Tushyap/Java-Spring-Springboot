package com.show.showRepository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.show.repository.ShowRepository;

@SpringBootTest
public class ShowRepoTest {

	@Autowired
	private ShowRepository showRepository;
	
	@Test
	void isSeatExists() {
		showRepository.findById(1l).get();
		Boolean actualResult = showRepository.isShowExists(1l);
		assertThat(actualResult).isTrue();
	}
}
