package com.rcintra.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloRest {

	@GET
	public String hello() {
		return "Hello Res!";
	}
	
}
