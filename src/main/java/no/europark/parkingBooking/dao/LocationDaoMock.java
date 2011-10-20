package no.europark.parkingBooking.dao;

import java.util.ArrayList;
import java.util.List;

import no.europark.parkingBooking.entity.Location;

public class LocationDaoMock implements LocationDao {

	@Override
	public List<Location> getLocations() {
		List<Location> locationList = new ArrayList<Location>();
		Location BGO = new Location("BGO", "Bergen / Flesland (BGO)");
		Location HAU = new Location("HAU", "Haugesund Karmøy (HAU)");
		Location OSL = new Location("OSL", "Oslo Gardermoen (OSL)");
		Location SVG = new Location("SVG", "Stavanger Sola (SVG)");
		Location TRD = new Location("TRD", "Trondheim Værnes (TRD)");
		
		locationList.add(BGO);
		locationList.add(HAU);
		locationList.add(OSL);
		locationList.add(SVG);
		locationList.add(TRD);
		
		return locationList;
	}

	@Override
	public Location getLocation(String locationCode) {
		List<Location> locationList = getLocations();
		Location location = null;
		for (Location l : locationList) {
			if (l.getLocationCode().equals(locationCode)) {
				
				location = l;
			}
		}
		return location;
	}
}
