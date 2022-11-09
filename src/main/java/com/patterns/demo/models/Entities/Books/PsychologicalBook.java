package com.patterns.demo.models.Entities.Books;

import com.patterns.demo.models.Entities.Book;

public class PsychologicalBook extends Book {

    public PsychologicalBook(String name, int price) {
        super(name, price);
    }

    @Override
    public String getVoucher() {
        return "The cost of psychological book: 70";
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
