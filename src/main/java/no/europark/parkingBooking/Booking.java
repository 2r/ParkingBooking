package no.europark.parkingBooking;

import java.util.Date;

public class Booking {
	
	private Long id;
	private String airport;
	private String parkingplace;
	private Date fromTime;
	private Date toTime;
	private User user;
	
	public Booking(Long id, String airport, String parkingplace, Date fromTime,	Date toTime, User user) {
		this.id = id;
		this.airport = airport;
		this.parkingplace = parkingplace;
		this.fromTime = fromTime;
		this.toTime = toTime;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getParkingplace() {
		return parkingplace;
	}

	public void setParkingplace(String parkingplace) {
		this.parkingplace = parkingplace;
	}

	public Date getFromTime() {
		return fromTime;
	}

	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}

	public Date getToTime() {
		return toTime;
	}

	public void setToTime(Date toTime) {
		this.toTime = toTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
