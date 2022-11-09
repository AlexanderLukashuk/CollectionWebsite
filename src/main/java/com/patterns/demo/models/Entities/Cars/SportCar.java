package com.patterns.demo.models.Entities.Cars;

//import Decorator.CarDecorator;
//import Entities.Car;
//import Interfaces.ICar;
import com.patterns.demo.models.Entities.Car;

public class SportCar extends Car {

    private Car car;

    public SportCar(Car car) {
        super(car);
    }

    public SportCar(String name, int price) {
        super(name, price);
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
