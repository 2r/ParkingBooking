package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ParkingOptionsForm extends VelocityForm{

	public ParkingOptionsForm(HttpServletRequest req) {
		super(req);
	}
	
	void show(PrintWriter writer) throws IOException {
        renderVelocityTemplate(writer, "/parking/parkingoptions.html.vm");
    }
	
	@Override
	protected List<String> getFieldNames() {
		// TODO Auto-generated method stub
		return Arrays.asList("name_query");
	}
	
	

}
