package no.europark.parkingBooking;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.europark.parkingBooking.dao.LocationDao;
import no.europark.parkingBooking.dao.LocationDaoImpl;
import no.europark.parkingBooking.dao.ParkingPlaceDao;
import no.europark.parkingBooking.dao.ParkingPlaceDaoImpl;
import no.europark.parkingBooking.entity.Location;
import no.europark.parkingBooking.entity.SearchTerms;
import no.europark.parkingBooking.entity.User;

public class ParkingServlet extends HttpServlet{

	private static final long serialVersionUID = 1125844790608528788L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
		 PrintWriter writer = resp.getWriter();
		 if (req.getPathInfo().equals("/timeselect.html")){
			 setDefaultVariables(req, writer);
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

	private void setDefaultVariables(HttpServletRequest req, PrintWriter writer) throws IOException {
		TimeSelectForm tform = new TimeSelectForm(req);
		
		LocationDao locationdao = new LocationDaoImpl();
		tform.setFormVariables(timeListHTMLGenerator("17:00"), locationListHTMLGenerator("NULL", locationdao.getLocations())
				);
		tform.show(writer);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		if (req.getPathInfo().equals("/parkingoptions.html")) {
			showParkingOptions(req, writer);
		} else if (req.getPathInfo().equals("/login.html")) {
			resp.sendRedirect("/parking/login.html");
		} else if (req.getPathInfo().equals("/createuser.html")) {
			resp.sendRedirect("/parking/createuser.html");
		} else if (req.getPathInfo().equals("/receipt.html")) {
			ReceiptForm rform = new ReceiptForm(req);
			User user = rform.createUser();
			rform.setUser(user);
			System.out.println(user.getEmail() + " - " + user.getFirstName() + " - " + user.getLastName() + " - " + user.getPassword() + " - " + user.getMobilePhone());
			rform.show(writer);
		}
	}
	
	private void showParkingOptions(HttpServletRequest req, PrintWriter writer) throws IOException {
		SearchTerms sterms = new SearchTerms(req.getParameter("date1"), req.getParameter("Hours_from"), req.getParameter("date2"), req.getParameter("Hours_to"), req.getParameter("Location"));
		ParkingOptionsForm form = new ParkingOptionsForm(req);
		ParkingPlaceDao dao = new ParkingPlaceDaoImpl();
		LocationDao locationdao = new LocationDaoImpl();
		form.setFormVariables(req.getParameter("dateFrom"),
							timeListHTMLGenerator(req.getParameter("Hours_from")),
							req.getParameter("dateTo"),
							timeListHTMLGenerator(req.getParameter("Hours_to")),
							locationListHTMLGenerator(req.getParameter("Location"), locationdao.getLocations())
				);
		form.setParkingPlaces(dao.getParkingPlaces("gardermoen", null, null));
		form.setSearchTerms(sterms);
		form.show(writer);
	}
	
	public static List<String> timeListHTMLGenerator(String selected_time) {
		List<String> return_list = new ArrayList<String>();
		String return_value, hour_count, min_count;
		for (int i = 0; i < 24; i++) {
			if (i < 10) {
				hour_count = "0" + i;
			}
			else {
				hour_count = i + "";
			}
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					min_count = "00";
				}
				else {
					min_count = "30";
				}
				return_value = hour_count +":"+ min_count;
				
				if (return_value.equals(selected_time)) {
					return_list.add("<option value=\"" + return_value + "\" selected=\"selected\">" + return_value + "</option>");
				}
				else {
					return_list.add("<option value=\"" + return_value + "\">" + return_value + "</option>");
				}
			}
			
		}
		return return_list;	
	}
	
	public static List<String> locationListHTMLGenerator(String selectedLocation, List<Location> locationList) {
		List<String> returnList = new ArrayList<String>();

		for (Location location : locationList) {
			if (location.getLocationCode().equals(selectedLocation)) {
				returnList.add("<option value=\"" + location.getLocationCode() + "\" selected=\"selected\">" + location.getLocationName() + "</option>"); 
			}
			else {
				returnList.add("<option value=\"" + location.getLocationCode() + "\">"+ location.getLocationName() + "</option>"); 
			}
		}
		
		return returnList;
	}
}
