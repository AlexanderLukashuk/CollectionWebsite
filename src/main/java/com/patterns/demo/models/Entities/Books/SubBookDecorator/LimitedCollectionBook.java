package com.patterns.demo.models.Entities.Books.SubBookDecorator;

import com.patterns.demo.models.Decorator.BookDecorator;
import com.patterns.demo.models.Entities.Book;

public class LimitedCollectionBook extends BookDecorator {
    public LimitedCollectionBook(Book book){
        super(book);
//        this.book = book;
        setPrice();
    }

    @Override
    public int getPrice() {
        return book.getPrice() + 120;
    }

    @Override
    public String getVoucher() {
        return this.GetPrice()+", limited collection cost (120)";
    }

    @Override
    public void setPrice() {
        this.Price += 25;
    }
}
