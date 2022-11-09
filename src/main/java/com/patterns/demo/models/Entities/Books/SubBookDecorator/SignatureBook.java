package com.patterns.demo.models.Entities.Books.SubBookDecorator;

import com.patterns.demo.models.Decorator.BookDecorator;
import com.patterns.demo.models.Entities.Book;

public class SignatureBook extends BookDecorator {

    public SignatureBook(Book book){
        super(book);
        setPrice();
    }

    @Override
    public String getVoucher() {
        return book.getVoucher()+", signature of author (20.8)";
    }


    @Override
    public int getPrice() {
        return this.Price + 20;
    }

    @Override
    public void setPrice() {
        this.Price += 200;
    }
}
