package com.booking.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "THEATER_TB")
public class TheaterTb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long theaterId;
	private String theaterName;
	private String theaterCity;
	@ElementCollection
	@OrderColumn(name = "movie")
	private List<Long> movieIds;
	@ElementCollection
	@OrderColumn(name = "screen")
	private List<Long> listOfScreenIds;
	private String managerName;
	private String managerContact;

	public TheaterTb(Long theaterId, String theaterName, String theaterCity, List<Long> movieIds,
			List<Long> listOfScreenIds, String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movieIds = movieIds;
		this.listOfScreenIds = listOfScreenIds;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public TheaterTb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public List<Long> getMovieIds() {
		return movieIds;
	}

	public void setMovieIds(List<Long> movieIds) {
		this.movieIds = movieIds;
	}

	public List<Long> getListOfScreenIds() {
		return listOfScreenIds;
	}

	public void setListOfScreenIds(List<Long> listOfScreenIds) {
		this.listOfScreenIds = listOfScreenIds;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	@Override
	public String toString() {
		return "TheaterTb [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", movies=" + movieIds + ", listOfScreens=" + listOfScreenIds + ", managerName=" + managerName
				+ ", managerContact=" + managerContact + "]";
	}

}
