package com.patterns.demo.models.Entities.Cars.CarsFeatures;

import com.patterns.demo.models.Decorator.CarDecorator;
import com.patterns.demo.models.Entities.Car;

public class EngineCapacity extends CarDecorator {

    public EngineCapacity(Car car){
        super(car);
    }

    @Override
    public String getVoucher() {
        return "Sport Car";
    }

    @Override
    public int getPrice() {
        return Price += 500;
    }
}
