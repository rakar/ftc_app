package org.montclairrobotics.cyborg.devices;

import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.LightSensor;

import org.montclairrobotics.cyborg.Cyborg;

/**
 * Created by rich on 10/1/2016.
 */

public class CBLightSensor implements CBDevice {
    String name;
    LightSensor lightSensor;

    public CBLightSensor(String name) {
        this.name = name;
        this.lightSensor = Cyborg.hardwareAdapter.robot.hardwareMap.lightSensor.get(name);
    }

    public double getRawLightDetected() {
        return lightSensor.getRawLightDetected();
    }

    public CBLightSensor enableLed(boolean enable) {
        lightSensor.enableLed(enable);
        return this;
    }

    public double getLightDetected() {
        return lightSensor.getLightDetected();
    }

    public double getRawLightDetectedMax() {
        return lightSensor.getRawLightDetectedMax();
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
        return lightSensor.status();
    }

    public void resetDeviceConfigurationForOpMode() {
        lightSensor.resetDeviceConfigurationForOpMode();
    }

    public String getConnectionInfo() {
        return lightSensor.getConnectionInfo();
    }

    public String getDeviceName() {
        return lightSensor.getDeviceName();
    }

    public HardwareDevice.Manufacturer getManufacturer() {
        return lightSensor.getManufacturer();
    }

    public int getVersion() {
        return lightSensor.getVersion();
    }

}
