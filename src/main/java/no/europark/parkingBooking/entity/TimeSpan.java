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