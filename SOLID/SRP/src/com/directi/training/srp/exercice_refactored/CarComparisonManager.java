package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class CarComparisonManager
{
    public Car getBestCar(List<Car> carList) {
        Car bestCar = null;
        for (Car car : carList) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
    

