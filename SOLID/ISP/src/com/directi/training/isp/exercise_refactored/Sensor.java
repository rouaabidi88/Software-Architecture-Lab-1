package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor 
{
    public void register(SensorInterface sensorInterface)
    {
        while (true) {
            if (isPersonClose()) {
                sensorInterface.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }    
}
