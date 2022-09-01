package com.theater.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHOW_TB")
public class ShowTb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showId;
	private String showStartTime;
	private String showEndTime;
	@ElementCollection
	private List<Long> seatIds;
	private String showName;
	private Long movieId;
	private Long screenId;
	private Long theaterId;

	public ShowTb(Long showId, String showStartTime, String showEndTime, List<Long> seatIds, String showName,
			Long movieId, Long screenId, Long theaterId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seatIds = seatIds;
		this.showName = showName;
		this.movieId = movieId;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}

	public ShowTb() {
		super();
	}

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

	public List<Long> getseatIds() {
		return seatIds;
	}

	public void setseatIds(List<Long> seatIds) {
		this.seatIds = seatIds;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Long getmovieId() {
		return movieId;
	}

	public void setmovieId(Long movieId) {
		this.movieId = movieId;
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

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", seatIds=" + seatIds + ", showName=" + showName + ", movieId=" + movieId + ", screenId=" + screenId
				+ ", theaterId=" + theaterId + "]";
	}

}
