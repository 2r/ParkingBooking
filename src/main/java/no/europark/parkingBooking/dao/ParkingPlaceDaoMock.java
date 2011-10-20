package no.europark.parkingBooking.dao;

import java.util.ArrayList;
import java.util.List;

import no.europark.parkingBooking.ParkingPlace;
import no.europark.parkingBooking.ParkingPlace.transportType;
import no.europark.parkingBooking.entity.TimeSpan;

public class ParkingPlaceDaoMock implements ParkingPlaceDao{

	@Override
	public List<ParkingPlace> getParkingPlaces(String locationCode, TimeSpan timeSpan) {
		List<ParkingPlace> parkingList = null;
		
		if (locationCode.equals("BGO")) {
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
		} else if (locationCode.equals("OSL")) {
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

	@Override
	public ParkingPlace getParkingPlace(String name) {
		List<ParkingPlace> parkingList = null;
		ParkingPlace parkingPlace = null;
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
		
		for (ParkingPlace p : parkingList) {
			if (p.getName().equals(name)) {
				parkingPlace = p;
			}
		}
		return parkingPlace;
	}
}
