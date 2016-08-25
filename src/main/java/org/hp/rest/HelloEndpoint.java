package org.hp.rest;

/**
 * Created by Keyur on 25-08-2016.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloEndpoint {

	@GET
	@Path("/{name}")
	public String hello(@PathParam("name") String name) {
		return "Hello from Home Provider:: " + name;
	}
}
