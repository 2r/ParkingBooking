package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



public class CreateUserForm extends VelocityForm{

	public CreateUserForm(HttpServletRequest req) {
		super(req);
	}
	
	void show(PrintWriter writer) throws IOException {
        renderVelocityTemplate(writer, "/parking/createuser.html.vm");
    }
	
	@Override
	protected List<String> getFieldNames() {
		// TODO Auto-generated method stub
		return Arrays.asList("name_query");
	}
}
