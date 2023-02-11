package com.directi.training.srp.exercise;

public class BestCar {

	private CarsDB carsDB;
	public BestCar(CarsDB carsDB){
    	this.carsDB=carsDB;  
    	}

	  public Car getBestCar()
	    {
	        Car bestCar = null;
	        for (Car car : this.carsDB.getCars()) {
	            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
	                bestCar = car;
	            }
	        }
	        return bestCar;
	    }
}
