package com.gottmusig.gottmusig.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gottmusig.gottmusig.facade.Control;
import lombok.extern.slf4j.Slf4j;

@Component
@Path("/wowhead/")
@Slf4j
public class WowHeadTest {

	@Autowired
	private Control control;
	
	@Path("test")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSimulationCraftData(@QueryParam("class") String wowClass, @QueryParam("slot") String slot) {
		log.debug("Requesting WowHeadItems");
		return Response.status(200).entity(control.wowHeadTest(wowClass, slot)).build();
	}
}
