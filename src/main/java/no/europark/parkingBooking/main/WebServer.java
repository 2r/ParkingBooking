package no.europark.parkingBooking.main;

import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8088);
        server.setHandler(createWebAppContext());
        server.start();
        String baseUrl = "http://localhost:" + "8088" + "/";
        System.out.println(baseUrl);
    }


    private static WebAppContext createWebAppContext() {
        return new WebAppContext(getSelfWebContext(), "/");
    }

    private static String getSelfWebContext() {
        URL[] urls = ((URLClassLoader)WebServer.class.getClassLoader()).getURLs();
        if (urls.length == 1 && urls[0].getFile().endsWith(".war")) {
            return urls[0].getFile();
        }
        return "src/main/webapp";
    }
}
