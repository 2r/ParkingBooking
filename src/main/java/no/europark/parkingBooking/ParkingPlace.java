package no.europark.parkingBooking;

public class ParkingPlace {
	
	public enum transportType {
		SHUTTLEBUS, WALK
	}
	
	private String name;
	private String imgUrl;
	private transportType transport;
	private String transportDescription;
	private String briefDescription;
	private String descriptionUrl;
	private int pricePerDay;
	
	public ParkingPlace(String name, String imgUrl, transportType transport, String transportDescription, String briefDescription, String descriptionUrl, int price) {
		this.name = name;
		this.imgUrl = imgUrl;
		this.transport = transport;
		this.transportDescription = transportDescription;
		this.briefDescription = briefDescription;
		this.descriptionUrl = descriptionUrl;
		this.pricePerDay = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public transportType getTransport() {
		return transport;
	}

	public void setTransport(transportType transport) {
		this.transport = transport;
	}

	public String getTransportDescription() {
		return transportDescription;
	}

	public void setTransportDescription(String transportDescription) {
		this.transportDescription = transportDescription;
	}

	public String getBriefDescription() {
		return briefDescription;
	}

	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	public String getDescriptionUrl() {
		return descriptionUrl;
	}

	public void setDescriptionUrl(String descriptionUrl) {
		this.descriptionUrl = descriptionUrl;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int price) {
		this.pricePerDay = price;
	}
}
