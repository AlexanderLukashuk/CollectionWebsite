package com.patterns.demo.models.Factory;

import com.patterns.demo.models.Factory.Interfaces.Collection;

public class ArchaeologicalCollection implements Collection {
    @Override
    public void send() {
        System.out.println("Preparing for sending Archaeological item...");
    }
}
