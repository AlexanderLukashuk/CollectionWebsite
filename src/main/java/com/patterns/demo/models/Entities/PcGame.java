package com.patterns.demo.models.Entities;

import com.patterns.demo.models.Decorator.GameDecorator;

public class PcGame extends GameDecorator {

    public PcGame(Game game) {
        super(game);
    }

    public PcGame(String name, int price) {
        super(name, price);
    }
}
