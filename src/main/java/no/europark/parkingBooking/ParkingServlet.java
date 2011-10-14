package no.europark.parkingBooking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParkingServlet extends HttpServlet{

	private static final long serialVersionUID = 1125844790608528788L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter writer = resp.getWriter();
		 if (req.getPathInfo().equals("/timeselect.html")){
			 TimeSelectForm tform = new TimeSelectForm(req);
			 tform.show(writer);
		 } else if (req.getPathInfo().equals("/parkingoptions.html")) {
			 showParkingOptions(req, writer);
		 } else if (req.getPathInfo().equals("/login.html")){
			 LoginForm lform = new LoginForm(req);
			 lform.show(writer);
		 } else if (req.getPathInfo().equals("/createuser.html")){
			 CreateUserForm cform = new CreateUserForm(req);
			 cform.show(writer);
		 }
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		if (req.getPathInfo().equals("/parkingoptions.html")) {
			showParkingOptions(req, writer);
		} else if (req.getPathInfo().equals("/parkingoptions.html")) {
			resp.sendRedirect("/parking/login.html");
		} else if (req.getPathInfo().equals("/login.html")) {
			resp.sendRedirect("/parking/createuser.html");
		} else if (req.getPathInfo().equals("/createuser.html")) {
			resp.sendRedirect("/parking/createuser.html");
		}
	}
	
	private void showParkingOptions(HttpServletRequest req, PrintWriter writer) throws IOException {
		ParkingOptionsForm form = new ParkingOptionsForm(req);
		ParkingPlaceDao dao = new ParkingPlaceDaoImpl();
		form.setParkingPlaces(dao.getParkingPlaces("gardermoen", null, null));
		form.show(writer);
	}
}
