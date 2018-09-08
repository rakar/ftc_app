package org.montclairrobotics.cyborgftc.devices;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DigitalChannelController;
import com.qualcomm.robotcore.hardware.HardwareDevice;

import org.montclairrobotics.cyborgftc.Cyborg;
import org.montclairrobotics.cyborgftc.utils.CBEdgeTrigger;

/**
 * Created by rich on 9/25/2016.
 */

public class CBDigitalChannel extends CBEdgeTrigger implements CBDevice {
    String name;
    DigitalChannel digitalChannel;

    public CBDigitalChannel(String name) {
        this.name = name;
        digitalChannel = Cyborg.hardwareAdapter.robot.hardwareMap.digitalChannel.get(name);
    }

    public CBDigitalChannel setMode(DigitalChannel.Mode mode) {
        digitalChannel.setMode(mode);
        return  this;
    }

    public CBDigitalChannel setState(boolean state) {
        digitalChannel.setState(state);
        return  this;
    }

    public CBDigitalChannel close() {
        digitalChannel.close();
        return  this;
    }

    public CBDigitalChannel resetDeviceConfigurationForOpMode() {
        digitalChannel.resetDeviceConfigurationForOpMode();
        return  this;
    }

    public DigitalChannel.Mode getMode() {
        return digitalChannel.getMode();
    }

    public String getConnectionInfo() {
        return digitalChannel.getConnectionInfo();
    }

    public String getDeviceName() {
        return digitalChannel.getDeviceName();
    }

    public HardwareDevice.Manufacturer getManufacturer() {
        return digitalChannel.getManufacturer();
    }

    public int getVersion() {
        return digitalChannel.getVersion();
    }

    @Override
    public void configure() {

    }

    @Override
    public void senseUpdate() {
        if(digitalChannel.getMode()== DigitalChannel.Mode.INPUT) {
            update(digitalChannel.getState());
        }
    }

    @Override
    public void controlUpdate() {

    }
}
