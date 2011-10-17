package no.europark.parkingBooking.entity;

public class Location {
	
	private String locationCode;
	private String locationName;
	
	public Location(String locationCode, String locationName) {
		this.locationCode = locationCode;
		this.locationName = locationName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
}
