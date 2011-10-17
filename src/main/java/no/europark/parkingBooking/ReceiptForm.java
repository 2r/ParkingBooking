package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class ReceiptForm extends VelocityForm{

		public ReceiptForm(HttpServletRequest req) {
			super(req);
		}
		
		void show(PrintWriter writer) throws IOException {
	        renderVelocityTemplate(writer, "/parking/receipt.html.vm");
	    }
		
		public void setUser(User user) {
	        addModelVariable("User", user);
	    }
		
		public User createUser() {
			User user = new User(getParameter("email"), getParameter("firstname"), getParameter("lastname"), getParameter("pwd"), getParameter("mobilephone"));
			return user;
		}
		
		@Override
		protected List<String> getFieldNames() {
			// TODO Auto-generated method stub
			return Arrays.asList("name_query");
		}
}
