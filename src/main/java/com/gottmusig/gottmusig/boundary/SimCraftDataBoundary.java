package com.gottmusig.gottmusig.boundary;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gottmusig.gottmusig.facade.Control;
import com.gottmusig.gottmusig.model.blizzard.BlizzardItem;
import com.gottmusig.gottmusig.model.dpscalculation.SimulationCraft;
import com.gottmusig.gottmusig.facade.ItemComparison;
import lombok.extern.slf4j.Slf4j;

@Component
@Path("/data")
@Slf4j
public class SimCraftDataBoundary {

	@Autowired
	private Control control;
	@Autowired
	private ItemComparison itemcomparison;

	/**
	 * For Testing try this urls Magier:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackrock&user=D�sen�ffner Krieger:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackhand&user=Malahkh Deamonhunter:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=Krag
	 * 'jin&user=Devillin Todesritter:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackhand&user=Glurak Druide:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackrock&user=Thodeon Priester:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Nemesis&user=Xhopez Schurke:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Aegwynn&user=Dexliz Paladin:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Arathor&user=Cavyxd M�nch:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Arathor&user=Nepho Hexenmeister:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackrock&user=Plexxi Schamane:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Blackrock&user=Ghostkillah Hunter:
	 * http://localhost:8080/gottmusig/simulationcraftdata?region=eu&server=
	 * Aegwynn&user=Imnotdaisy
	 */

	@Path("simulationcraftdata")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSimulationCraftData(@QueryParam("region") String region, //
			@QueryParam("server") String server, @QueryParam("user") String user) {

		SimulationCraft simulationCraftData = control.getSpecificSimulationCraftData(region, server, user);
		return Response.status(200).entity(simulationCraftData).build();
	}

	//BSP mit curl
	//curl -H "Content-Type:text/plain" --data "Tier19H/Mage_Arcane_T19H.simc" http://localhost:8080/gottmusig/dps
	@Path("dps")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCommandsForCalculation(String file) {
		log.info("POST COMMANDS: "+file);
		String dps = control.getDpsForStartPage(file);
		return Response.status(200).entity(dps).build();
	}
	
	@Path("slotItem")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSlotItemList(@QueryParam("region") String region, //
			@QueryParam("server") String server, @QueryParam("user") String user, @QueryParam("slot") String slot,
			@QueryParam("quality") String quality) {
		
		Map<BlizzardItem, Double> result = new LinkedHashMap<>();
		try {
			 result = itemcomparison.getItemRankingBy(region, server, user, slot, quality);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(result).build();
	}

}
