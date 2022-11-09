package com.patterns.demo.models.Entities;

import Decorator.CarDecorator;
import Interfaces.ICar;

public class CarSportEquipment extends CarDecorator {

    private Car car;

    public CarSportEquipment(Car car) {
        super(car);
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
