import java.io.IOException;
import java.net.URI;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("at.goldinger");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:1312/"), rc);
        System.out.println("Server started");

        System.out.println("Press enter to close the server");
        System.in.read();
        server.stop(0);
        System.out.println("Server stopped");
    }
}