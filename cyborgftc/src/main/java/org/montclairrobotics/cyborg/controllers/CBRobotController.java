/**
 * 
 */
package org.montclairrobotics.cyborg.controllers;

import org.montclairrobotics.cyborg.Cyborg;
import org.montclairrobotics.cyborg.utils.CBModule;

public abstract class CBRobotController extends CBModule {

	public CBRobotController(Cyborg robot) {
		super(robot);
	}

	public abstract void update();
	public void configHardware() {
		
	}

}
