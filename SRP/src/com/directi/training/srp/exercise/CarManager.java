package com.directi.training.srp.exercise;



public class CarManager
{
	private CarsDB carsDB;
	private BestCar bestCar;
	
    public CarManager(){
    	this.carsDB=new CarsDB();
    	this.bestCar=new BestCar(this.carsDB);
    	}

    public Car getCarById(final String carId)
    {
        
        return this.carsDB.getCarById(carId);
    }

    public String getCarsNames()
    {
       return this.carsDB.getCarsNames();
    }

    public Car getBestCar()
    {
        
        return this.bestCar.getBestCar();
    }
   
}
