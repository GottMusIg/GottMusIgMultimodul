package com.gottmusig.gottmusig.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gottmusig.gottmusig.facade.Control;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;

import lombok.extern.slf4j.Slf4j;

@Path("/wowhead/")
@Slf4j
public class WowHeadTest {

	@Inject
	Control control;
	
	@Path("test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSimulationCraftData() {
		log.debug("Requesting WowHeadItems");
		return Response.status(200).entity(control.test()).build();
	}
	
	
}
