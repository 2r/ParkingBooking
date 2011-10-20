package no.europark.parkingBooking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import no.europark.parkingBooking.entity.ParkingPlace;
import no.europark.parkingBooking.entity.TimeSpan;

public class Utility {
	
	public static Date stringToDate(String dateAsString) throws Exception {
		DateFormat formatter; 
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = (Date)formatter.parse(dateAsString);  
		return date;
	}
	
	public static int CalculatePrice(TimeSpan timeSpan, ParkingPlace parkingPlace) {
		int days = daysBetween(timeSpan.getDateFrom(), timeSpan.getDateTo());
		int totalPrice = days * parkingPlace.getPricePerDay();
		return totalPrice;
	}
	
	
	public static int daysBetween(Date d1, Date d2){
		return (int)((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
}
