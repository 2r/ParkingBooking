package no.europark.parkingBooking.dao;

import java.util.List;

import no.europark.parkingBooking.ParkingPlace;
import no.europark.parkingBooking.entity.SearchTerms;

public interface ParkingPlaceDao {
	List<ParkingPlace> getParkingPlaces(SearchTerms searchTerms);
}
