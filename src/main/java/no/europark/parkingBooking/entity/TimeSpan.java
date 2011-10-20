package no.europark.parkingBooking.entity;

public class TimeSpan {
	
	private String dateFrom;
	private String dateTo;
	private String hoursFrom;
	private String hoursTo;
	
	public TimeSpan(String dateFrom, String dateTo, String hoursFrom, String hoursTo) {
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.hoursFrom = hoursFrom;
		this.hoursTo = hoursTo;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getHourFrom() {
		return hoursFrom;
	}

	public void setHourFrom(String hourFrom) {
		this.hoursFrom = hourFrom;
	}

	public String getHourTo() {
		return hoursTo;
	}

	public void setHourTo(String hourTo) {
		this.hoursTo = hourTo;
	}	
}