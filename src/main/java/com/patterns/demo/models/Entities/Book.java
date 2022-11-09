package com.patterns.demo.models.Entities;

import com.patterns.demo.models.Interfaces.ActionsInterfaces.IRead;
import com.patterns.demo.models.Interfaces.MyCollectionInterfaces.CreativeActivity;

public abstract class Book extends CreativeActivity implements IRead {

    public int NumberOfPages;

    public Book() {}

    public Book(String name, int price) {
        super(name, price);
    }

    public Book(String name, int price, String genre, String desc) {
        super(name, price, genre, desc);
    }

    public Book(Book iBook) {
        Name = iBook.Name;
        Price = iBook.Price;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getName() {
        return this.Name;
    }

    public int getPrice() {
        return this.Price;
    }

    @Override
    public void Read() {
        System.out.println("Intensive reading");
    }

    public String getVoucher() {
        return "Features:";
    }

    public void setPrice() { }
}
