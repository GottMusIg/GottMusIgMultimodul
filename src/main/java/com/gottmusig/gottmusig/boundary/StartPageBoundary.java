package com.gottmusig.gottmusig.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class StartPageBoundary {

	@GET
	@Produces({ MediaType.TEXT_HTML})
	public Response getStartPage() { //
		
		return Response.ok().entity("Hello World").build();
		
		}
}
