package com.screen.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCREEN_TB")
public class ScreenTb {

	// data members 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long screenId;
	
	private Long theaterId;
	
	private String screenName;

	@ElementCollection
	private List<Long> showIds;

	private Long rowsCount;
	
	private Long columnsCount;

	// parameterized constructor
	public ScreenTb(Long screenId, Long theaterId, String screenName, List<Long> showIds, Long rowsCount,
			Long columnsCount) {
		super();
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.screenName = screenName;
		this.showIds = showIds;
		this.rowsCount = rowsCount;
		this.columnsCount = columnsCount;
	}

	// default constructor
	public ScreenTb() {
		super();

	}

	// getters and setters 
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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Long> getShowIds() {
		return showIds;
	}

	public void setShowIds(List<Long> showIds) {
		this.showIds = showIds;
	}

	public Long getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(Long rowsCount) {
		this.rowsCount = rowsCount;
	}

	public Long getColumnsCount() {
		return columnsCount;
	}

	public void setColumnsCount(Long columnsCount) {
		this.columnsCount = columnsCount;
	}

	
}
