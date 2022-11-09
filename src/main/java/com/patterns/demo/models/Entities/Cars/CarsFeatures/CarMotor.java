package com.patterns.demo.models.Entities.Cars.CarsFeatures;

import com.patterns.demo.models.Decorator.CarDecorator;
import com.patterns.demo.models.Entities.Car;

public class CarMotor extends CarDecorator {

    public CarMotor(Car car){
        super(car);
    }

    @Override
    public String getVoucher() {
        return "Comfort ";
    }

    @Override
    public int getPrice() {
        return Price += 1000;
    }
}
