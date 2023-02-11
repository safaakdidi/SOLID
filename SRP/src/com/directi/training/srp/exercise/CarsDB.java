package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarsDB {
	 private List<Car> _carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
	            new Car("3", "Megane", "Renault"));
	 
	 
	    public CarsDB() {
	    	this._carsDb=Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
		            new Car("3", "Megane", "Renault")); 
	    	}
	    
	    public List<Car> getCars() {
	    	return this._carsDb;
	    }
	    
	    public Car getCarById(final String carId)
	    {
	        for (Car car : this._carsDb) {
	            if (car.getId().equals(carId)) {
	                return car;
	            }
	        }
	        return null;
	    }
	    
	    public String getCarsNames()
	    {
	        StringBuilder sb = new StringBuilder();
	        for (Car car : _carsDb) {
	            sb.append(car.getBrand());
	            sb.append(" ");
	            sb.append(car.getModel());
	            sb.append(", ");
	        }
	        return sb.substring(0, sb.length() - 2);
	    }
}
