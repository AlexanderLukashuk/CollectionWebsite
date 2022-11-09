package com.patterns.demo.models.Entities;

import com.patterns.demo.models.Interfaces.IGame;
import com.patterns.demo.models.Interfaces.MyCollectionInterfaces.CreativeActivity;

public abstract class Game extends CreativeActivity implements IGame {

    public Game() {}

    public Game(Game game) {
        Name = game.Name;
        Price = game.Price;
    }

    public Game(String name, int price) {
        super(name, price);
    }

    @Override
    public void StartGame() {
        System.out.println("Welcome to " + this.Name);
    }
}
