package no.europark.parkingBooking.dao;

import java.util.List;

import no.europark.parkingBooking.entity.ParkingPlace;
import no.europark.parkingBooking.entity.TimeSpan;

public interface ParkingPlaceDao {
	List<ParkingPlace> getParkingPlaces(String locationCode, TimeSpan timeSpan);
	ParkingPlace getParkingPlace(String name);
}
