package com.patterns.demo.models.Entities.Cars;

import Decorator.CarDecorator;
import Entities.Car;

public class BasicCar extends Car {


    public BasicCar(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
