package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class TimeSelectForm extends VelocityForm{

	public TimeSelectForm(HttpServletRequest req) {
		super(req);
	}
	
	void show(PrintWriter writer) throws IOException {
        renderVelocityTemplate(writer, "/parking/timeselect.html.vm");
    }
	
	@Override
	protected List<String> getFieldNames() {
		return Arrays.asList("name_query");
	}

	public void setFormVariables(List<String> hourDefaultList, List<String> locationDefaultList) {
		 addModelVariable("hourDefaultList", hourDefaultList);
	     addModelVariable("locationDefaultList", locationDefaultList);
	}
	
}
