package com.patterns.demo.models.Entities.Books;

import com.patterns.demo.models.Entities.Book;

public class RomanceBook extends Book {

    public RomanceBook(String name, int price) {
        super(name, price);
    }

    @Override
    public String getVoucher() {
        return "The cost of romance book: 80";
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
