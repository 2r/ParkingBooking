package no.europark.parkingBooking.dao;

import java.util.ArrayList;
import java.util.List;

import no.europark.parkingBooking.ParkingPlace;
import no.europark.parkingBooking.ParkingPlace.transportType;
import no.europark.parkingBooking.entity.SearchTerms;

public class ParkingPlaceDaoImpl implements ParkingPlaceDao{

	@Override
	public List<ParkingPlace> getParkingPlaces(SearchTerms searchTerms) {
		System.out.println("--------------------" + searchTerms.getLocation());
		List<ParkingPlace> parkingList = null;
		
		if (searchTerms.getLocation().equals("BGO")) {
			ParkingPlace p1 = new ParkingPlace(	"P1", 
					"../fileadmin/site_images/parkingplaces/p1.gif", 
					transportType.SHUTTLEBUS, 
					"hvert 15. min", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					1430);
			ParkingPlace p2 = new ParkingPlace(	"P2", 
					"../fileadmin/site_images/parkingplaces/p2.gif", 
					transportType.SHUTTLEBUS, 
					"Vegg i vegg med terminalen, 1-5 min å gå.", 
					"Langtidsparkering for fattige charterfolk.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					1430);
			ParkingPlace p3 = new ParkingPlace(	"P3", 
					"../fileadmin/site_images/parkingplaces/p3.gif", 
					transportType.SHUTTLEBUS, 
					"hvert 10. min", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					830);
			ParkingPlace p4 = new ParkingPlace(	"P4", 
					"../fileadmin/site_images/parkingplaces/p4.gif", 
					transportType.WALK, 
					"400m fra terminalen, 1-5 min å gå.", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					930);
			
			parkingList = new ArrayList<ParkingPlace>();
			parkingList.add(p1);
			parkingList.add(p2);
			parkingList.add(p3);
			parkingList.add(p4);
		} else if (searchTerms.getLocation().equals("OSL")) {
			ParkingPlace p1 = new ParkingPlace(	"P1", 
					"../fileadmin/site_images/parkingplaces/p1.gif", 
					transportType.SHUTTLEBUS, 
					"hvert 15. min", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					1320);
			ParkingPlace p2 = new ParkingPlace(	"P2", 
					"../fileadmin/site_images/parkingplaces/p2.gif", 
					transportType.WALK, 
					"Vegg i vegg med terminalen, 1-5 min å gå.", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					1090);

			parkingList = new ArrayList<ParkingPlace>();
			parkingList.add(p1);
			parkingList.add(p2);
		} else {
			ParkingPlace p1 = new ParkingPlace(	"P1", 
					"../fileadmin/site_images/parkingplaces/p1.gif", 
					transportType.SHUTTLEBUS, 
					"hvert 15. min", 
					"Business eller fritidsparkering for reisende som ønsker enkel, effektiv og bekvem parkering.",
					"../fileadmin/parking_info/oslo_lufthavn_p2.pdf",
					1320);
			parkingList = new ArrayList<ParkingPlace>();
			parkingList.add(p1);
		}
		return parkingList;
	}
	
}
