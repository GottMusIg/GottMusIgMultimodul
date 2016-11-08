package com.gottmusig.gottmusig.model.dpscalculation;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SimulationCraftInputs {

	private String region;
	private String server;
	private String user;
	private String command;
	
	
}
