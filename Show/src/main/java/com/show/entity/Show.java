package com.show.entity;

import java.util.ArrayList;
import java.util.List;

public class Show {

	//data members
	private Long showId;
	private String showStartTime;
	private String showEndTime;
	List<Seat> seats = new ArrayList<>();
	private String showName;
	private Movie movieName;
	private Long screenId;
	private Long theaterId;

	// parameterized constructor
	public Show(Long showId, String showStartTime, String showEndTime, List<Seat> seats, String showName,
			Movie movieName, Long screenId, Long theaterId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seats = seats;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}

	// default constructor
	public Show() {
		super();
	}

	//data encapsulation - getters and setters 
	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public String getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(String showStartTime) {
		this.showStartTime = showStartTime;
	}

	public String getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMovieName() {
		return movieName;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}

	public Long getScreenId() {
		return screenId;
	}

	public void setScreenId(Long screenId) {
		this.screenId = screenId;
	}

	public Long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}

	// to string method to see the output on console 
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", seats=" + seats + ", showName=" + showName + ", movieName=" + movieName + ", screenId=" + screenId
				+ ", theaterId=" + theaterId + "]";
	}

}
