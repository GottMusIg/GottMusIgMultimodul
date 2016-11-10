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
	 * For Testing try this urls
	 * Magier: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackrock&user=Døsenöffner 
	 * Krieger: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackhand&user=Malahkh  
	 * Deamonhunter: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Krag'jin&user=Devillin 
	 * Todesritter: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackhand&user=Glurak  
	 * Druide: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackrock&user=Thodeon
	 * Priester: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Nemesis&user=Xhopez  
	 * Schurke: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Aegwynn&user=Dexliz   
	 * Paladin: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Arathor&user=Cavyxd  
	 * Mönch: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Arathor&user=Nepho 
	 * Hexenmeister: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackrock&user=Plexxi 
	 * Schamane: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Blackrock&user=Ghostkillah
	 * Hunter: http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Aegwynn&user=Imnotdaisy
	 */

	@Path("simulationcraftdata")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSimulationCraftData(@QueryParam("region") String region, //
			@QueryParam("server") String server, @QueryParam("user") String user) {

		SimulationCraft simulationCraftData = control.getSimulationCraftData(region, server, user);

		return Response.status(200).entity(simulationCraftData).build();

	}
}
