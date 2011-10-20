package no.europark.parkingBooking.entity;

import java.util.Date;

public class TimeSpan {
	
	private Date dateFrom;
	private Date dateTo;
	private String hoursFrom;
	private String hoursTo;
	
	public TimeSpan(Date dateFrom, Date dateTo, String hoursFrom, String hoursTo) {
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.hoursFrom = hoursFrom;
		this.hoursTo = hoursTo;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getHoursFrom() {
		return hoursFrom;
	}

	public void setHoursFrom(String hourFrom) {
		this.hoursFrom = hourFrom;
	}

	public String getHoursTo() {
		return hoursTo;
	}

	public void setHoursTo(String hourTo) {
		this.hoursTo = hourTo;
	}	
}