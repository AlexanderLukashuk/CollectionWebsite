package com.patterns.demo.models.Factory;

import com.patterns.demo.models.Factory.Interfaces.Collection;

public abstract class CollectionFactory2 {
    public void orderCollection() {
        System.out.println("Ordering Collection...");
        Collection collection = findCollection();
        collection.send();
    }

    public abstract Collection findCollection();
}
