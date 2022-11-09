package com.patterns.demo.models.Factory;

import com.patterns.demo.models.Factory.Interfaces.Collection;

public class ArchaeologicalCollectionFactory extends CollectionFactory2 {
    @Override
    public Collection findCollection() {
        System.out.println("Sending Archaeological collection item...");
        return new ArchaeologicalCollection();

    }
}
