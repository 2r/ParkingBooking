package no.europark.parkingBooking.dao;

import java.util.List;

import no.europark.parkingBooking.entity.Location;

public interface LocationDao {
	List<Location> getLocations();
	Location getLocation(String locationCode);
}
