package com.gottmusig.gottmusig.model.dpscalculation;

import com.gottmusig.gottmusig.model.wowhead.ClassSpec;
import com.gottmusig.gottmusig.model.wowhead.Classes;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SimulationCraftInputs {

	private String region;
	private String server;
	private String user;
	private String command;

	private Classes clazz;
	private ClassSpec spec;

	public void addCommand(String command){
		this.command+=" "+command;
	}

	public boolean simulateWithGeneratedClass(){
		if(clazz != null && spec != null){
			return true;
		}
		return false;
	}
}
