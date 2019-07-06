package main;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private int number;
	private String town;
	private String street;
	private String description;
	private List<Point> pointList = new ArrayList<>();
	private boolean isMarked;
	private boolean isMeasured;
	private boolean isDone;
	private String startDate;
	private String markDate;
	private String measureDate;
	private String doneDate;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Point> getPointList() {
		return pointList;
	}
	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	public boolean isMarked() {
		return isMarked;
	}
	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}
	public boolean isMeasured() {
		return isMeasured;
	}
	public void setMeasured(boolean isMeasured) {
		this.isMeasured = isMeasured;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getMarkDate() {
		return markDate;
	}
	public void setMarkDate(String markDate) {
		this.markDate = markDate;
	}
	public String getMeasureDate() {
		return measureDate;
	}
	public void setMeasureDate(String measureDate) {
		this.measureDate = measureDate;
	}
	public String getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(String doneDate) {
		this.doneDate = doneDate;
	}
	@Override
	public String toString() {
		return "Project [number=" + number + ", town=" + town + ", street=" + street + ", description=" + description
				+ ", isMarked=" + isMarked + ", isMeasured=" + isMeasured + ", isDone="
				+ isDone + ", startDate=" + startDate + ", markDate=" + markDate + ", measureDate=" + measureDate
				+ ", doneDate=" + doneDate + "]";
	}
}
