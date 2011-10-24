package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import no.europark.parkingBooking.entity.Location;
import no.europark.parkingBooking.entity.ParkingPlace;
import no.europark.parkingBooking.entity.TimeSpan;
import no.europark.parkingBooking.entity.User;

public class PaymentForm extends VelocityForm{

	public PaymentForm(HttpServletRequest req) {
		super(req);
	}
	
	void show(PrintWriter writer) throws IOException {
        renderVelocityTemplate(writer, "/parking/payment.html.vm");
    }
	
	public void setUser(User user) {
        addModelVariable("User", user);
    }
	
	public void setLocation(Location location) {
        addModelVariable("Location", location);
    }
	
	public void setDateTo(String dateTo){
		addModelVariable("DateTo", dateTo);
	}
	
	public void setDateFrom(String dateFrom){
		addModelVariable("DateFrom", dateFrom);
	}
	
	public void setHoursTo(String hoursTo){
		addModelVariable("HoursTo", hoursTo);
	}
	
	public void setHoursFrom(String hoursFrom){
		addModelVariable("HoursFrom", hoursFrom);
	}
	
	public void setParkingPlace(ParkingPlace parkingPlace) {
        addModelVariable("ParkingPlace", parkingPlace);
    }
	
	public void setTotalPrice(TimeSpan timeSpan, ParkingPlace parkingPlace) {
		int totalPrice = Utility.CalculatePrice(timeSpan, parkingPlace);
		addModelVariable("TotalPrice", totalPrice);
	}
	
	@Override
	protected List<String> getFieldNames() {
		return Arrays.asList("name_query");
	}
}
