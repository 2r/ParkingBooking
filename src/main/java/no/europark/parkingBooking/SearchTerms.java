package no.europark.parkingBooking;

public class SearchTerms {
	
	
	private String dateFrom;
	private String hourFrom;
	private String dateTo;
	private String hourTo;
	private String location;

	
	public SearchTerms(String dateFrom, String hourFrom, String dateTo, String hourTo, String location) {
		this.dateFrom = dateFrom;
		this.hourFrom = hourFrom;
		this.dateTo = dateTo;
		this.hourTo = hourTo;
		this.location = location;
	}

	public String getDateFrom() {
		return dateFrom;
	}
	public String getHourFrom() {
		return hourFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public String dateFrom() {
		return dateFrom;
	}
	public String getHourTo() {
		return hourTo;
	}
	public String getLocation() {
		return location;
		

		
	}




}