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

@Path("/")
public class SimCraftDataBoundary {
	
	@Inject
	private Control control;
	
	
	/**
	 * For Testing try this url
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackrock&user=Døsenöffner
	 * 
	 */
	
	@Path("simulationcraftdata")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSimulationCraftData(@QueryParam("region") String region, //
			@QueryParam("server") String server, @QueryParam("user") String user){
		
		
		SimulationCraft simulationCraftData = control.getSimulationCraftData(region, server, user);
		
		return Response.status(200).entity(simulationCraftData).build();
		
	}
}
