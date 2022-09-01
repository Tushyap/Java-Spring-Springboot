package com.ticket.entity;

import java.util.ArrayList;
import java.util.List;

public class Screen {
	
	private Long screenId;
	private Long theaterId;
	private String screenName;
	private List<Show> showList= new ArrayList<>();
	private Long rowsCount;
	private Long columnsCount;
	
	public Screen(Long screenId, Long theaterId, String screenName, List<Show> showList, Long rowsCount,
			Long columnsCount) {
		super();
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.screenName = screenName;
		this.showList = showList;
		this.rowsCount = rowsCount;
		this.columnsCount = columnsCount;
	}
	
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Show> getShowList() {
		return showList;
	}

	public void setShowList(List<Show> showList) {
		this.showList = showList;
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
