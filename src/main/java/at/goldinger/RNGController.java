package at.goldinger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("api")
public class RNGController {
    public int RNG(int min, int max) {      // taken from: https://www.baeldung.com/java-generating-random-numbers-in-range
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getRND(){
        Response.ResponseBuilder rb = Response.ok(RNG(500, 600));
        return rb.header("Access-Control.Allow-Origin", "*").build();
    }
}
