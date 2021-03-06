package org.montclairrobotics.cyborg.devices;

import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;

import org.montclairrobotics.cyborg.Cyborg;

/**
 * Created by rich on 10/1/2016.
 */

public class CBUltrasonicSensor implements CBDevice {
    String name;
    UltrasonicSensor ultrasonicSensor;

    public CBUltrasonicSensor(String name) {
        this.name = name;
        this.ultrasonicSensor = Cyborg.hardwareAdapter.robot.hardwareMap.ultrasonicSensor.get(name);
    }

    public double getUltrasonicLevel() {
        return ultrasonicSensor.getUltrasonicLevel();
    }

    @Override
    public CBDeviceControl getDeviceControl() {
        return deviceControl;
    }

    CBDeviceControl deviceControl = new CBDeviceControl() {

        @Override
        public void init() {

        }

        @Override
        public void senseUpdate() {

        }

        @Override
        public void controlUpdate() {

        }
    };

    public String getStatus() {
        return ultrasonicSensor.status();
    }

    public void resetDeviceConfigurationForOpMode() {
        ultrasonicSensor.resetDeviceConfigurationForOpMode();
    }

    public String getConnectionInfo() {
        return ultrasonicSensor.getConnectionInfo();
    }

    public String getDeviceName() {
        return ultrasonicSensor.getDeviceName();
    }

    public HardwareDevice.Manufacturer getManufacturer() {
        return ultrasonicSensor.getManufacturer();
    }

    public int getVersion() {
        return ultrasonicSensor.getVersion();
    }

}
