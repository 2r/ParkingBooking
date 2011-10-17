package no.europark.parkingBooking.dao;

import java.util.Date;
import java.util.List;

import no.europark.parkingBooking.ParkingPlace;

public interface ParkingPlaceDao {
	List<ParkingPlace> getParkingPlaces(String airport, Date entryTime, Date exitTime);
}
