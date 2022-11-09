package com.patterns.demo.models.Entities.Books.SubBookDecorator;

import com.patterns.demo.models.Decorator.BookDecorator;
import com.patterns.demo.models.Entities.Book;

public class AdditionalEditionBook extends BookDecorator {
    public AdditionalEditionBook(Book book) {
//        this.iBook = iBook;
        super(book);

        setPrice();
    }

    @Override
    public String getVoucher() {
        return book.getVoucher()+", Additional edition for this book (30.56)";
    }

    @Override
    public int getPrice() {
        return this.GetPrice() + 30;
    }

    @Override
    public void setPrice() {
        this.Price += 10;
    }
}
