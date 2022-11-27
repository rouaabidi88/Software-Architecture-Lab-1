package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    private CarDb carDb;
    private CarComparisonManager carComparisonManager; 

    public CarManager(CarDb carDb, CarComparisonManager carComparsionManager) {
        this.carDb = carDb;
        this.carComparisonManager = carComparsionManager;
    }

    public Car getCarById(final String carId) {
        return carDb.getFromDb(carId);
    }

    public Car getBestCar() {
        return carComparisonManager.getBestCar(carDb.getCarsList());
    }
}

