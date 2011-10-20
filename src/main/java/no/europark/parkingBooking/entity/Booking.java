package no.europark.parkingBooking.entity;

import java.util.UUID;


public class Booking {
	
	private UUID bookingID;
	private TimeSpan timeSpan;
	private Location location;
	private User user;
	private ParkingPlace parkingPlace;
	
	public Booking(TimeSpan timeSpan, Location location, User user, ParkingPlace parkingPlace) {
		this.bookingID = UUID.randomUUID();
		this.timeSpan = timeSpan;
		this.location = location;
		this.user = user;
		this.parkingPlace = parkingPlace;
	}

	public TimeSpan getTimeSpan() {
		return timeSpan;
	}

	public void setTimeSpan(TimeSpan timeSpan) {
		this.timeSpan = timeSpan;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UUID getBookingID() {
		return bookingID;
	}

	public ParkingPlace getParkingPlace() {
		return parkingPlace;
	}

	public void setParkingPlace(ParkingPlace parkingPlace) {
		this.parkingPlace = parkingPlace;
	}
}
