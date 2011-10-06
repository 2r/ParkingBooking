package no.steria.kata.javaee.main;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.NamingException;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.jetty.plus.jndi.EnvEntry;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.hibernate.cfg.Environment;

import com.google.common.io.Files;
import com.google.common.io.Resources;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class WebServer {

    public static void main(String[] args) throws Exception {
        extractFile(new File("log4j.properties"));
        PropertyConfigurator.configureAndWatch("log4j.properties");

        File propertiesFile = new File("personweb.properties");
        extractFile(propertiesFile);
        mergePropertiesFromFile(propertiesFile);
        registerDataSource("jdbc/personDs", "personweb.datasource");
        System.setProperty(Environment.HBM2DDL_AUTO, "update");

        Server server = new Server(getHttpPort());
        server.setHandler(createWebAppContext());
        server.start();

        String baseUrl = "http://localhost:" + getHttpPort() + "/";
        System.out.println(baseUrl);
    }

    private static int getHttpPort() {
        return Integer.parseInt(System.getProperty("personweb.http.port", "8088"));
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

    private static void extractFile(File propertiesFile) throws IOException {
        if (!propertiesFile.exists()) {
            Files.copy(Resources.newInputStreamSupplier(Resources.getResource(propertiesFile.getName())),
                propertiesFile);
        }
    }

    private static void mergePropertiesFromFile(File propertiesFile) throws IOException {
        Properties newProperties = new Properties();
        InputStream inStream = new FileInputStream(propertiesFile);
        newProperties.load(inStream);
        inStream.close();
        newProperties.putAll(System.getProperties());
        System.setProperties(newProperties);
    }

    private static void registerDataSource(String jndiDataSource, String configPrefix) throws NamingException,
        PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(System.getProperty(configPrefix + ".driverClassName", "org.hsqldb.jdbcDriver"));
        dataSource.setJdbcUrl(System.getProperty(configPrefix + ".url", "jdbc:hsqldb:file:target/test-db"));
        dataSource.setUser(System.getProperty(configPrefix + ".username", "sa"));
        dataSource.setPassword(System.getProperty(configPrefix + ".password", ""));
        dataSource.setAcquireRetryAttempts(0);
        new EnvEntry(jndiDataSource, dataSource);
        dataSource.getConnection().close();
    }
}
