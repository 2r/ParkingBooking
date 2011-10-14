package no.europark.parkingBooking;

import java.util.Date;
import java.util.List;

public interface ParkingPlaceDao {
	List<ParkingPlace> getParkingPlaces(String airport, Date entryTime, Date exitTime);
}
