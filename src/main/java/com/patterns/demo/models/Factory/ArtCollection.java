package com.patterns.demo.models.Factory;

import com.patterns.demo.models.Factory.Interfaces.Collection;

public class ArtCollection implements Collection {
    @Override
    public void send() {
        System.out.println("Preparing for sending new Art...");
    }
}
