package com.patterns.demo.models.Entities.Cars;

//import Decorator.CarDecorator;
//import Entities.Car;
//import Interfaces.ICar;
import com.patterns.demo.models.Entities.Car;

public class LuxuryCar extends Car {

    private Car car;

    public LuxuryCar(Car car) {
        super(car);
    }

    public LuxuryCar(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
