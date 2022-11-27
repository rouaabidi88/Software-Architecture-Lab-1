package com.directi.training.isp.exercise_refactored;

import java.util.TimerTask;

import javax.management.timer.TimerNotification;

public class Timer 
{
    public void register(long timeOut, final TimerInterface timerInterface)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timerInterface.timeOutCallback();
            }
        }, timeOut);
    }   
}
