package com.test.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.to.Track;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {
		System.out.println("ZZZZZZZZZZZZZZZZZZZZZZ");
		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}
    
    // The Java method will process HTTP GET requests
    @GET
    @Path("/get")
    @Produces("text/plain")
    public String getClichedMessage() {
    	System.out.println("XXXXXXXXXXXXXXXx");
        return "Hello World";
    }
}