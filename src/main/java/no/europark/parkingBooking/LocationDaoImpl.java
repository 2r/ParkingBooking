package no.europark.parkingBooking;

import java.util.ArrayList;
import java.util.List;

public class LocationDaoImpl implements LocationDao {

	@Override
	public List<Location> getLocations() {
		List<Location> locationList = new ArrayList<Location>();
		Location BGO = new Location("BGO", "Bergen / Flesland (BGO");
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
	

}
