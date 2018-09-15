package org.montclairrobotics.cyborg.devices;

import org.montclairrobotics.cyborg.Cyborg;
import org.montclairrobotics.cyborg.utils.CBEnums;

public class CBPov extends CBPOVRef implements CBDevice {
	private int state;
	private CBJoystick joystick;

	public CBPov(CBEnums.CBJoystickId stickID, CBEnums.CBPOVId index) {
		super(stickID, index);
		joystick = Cyborg.hardwareAdapter.getJoystick(stickID);
	}

	public int get() {
		return state;
	}

	@Override
	public void configure() {
	}

	@Override
	public void senseUpdate() {
		state = joystick.getRawPOV(index);
	}

	@Override
	public void controlUpdate() {

	}

}