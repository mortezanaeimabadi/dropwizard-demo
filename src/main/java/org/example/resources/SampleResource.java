package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;
import java.util.Date;

@Path("/sample")
public class SampleResource{

    @GET
    @Path("/hello")
    public String sayHello(){
        return "hello "+new Date();
    }
}
