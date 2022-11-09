package com.patterns.demo.controllers;

import com.patterns.demo.models.Entities.Book;
import com.patterns.demo.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollectionsListController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/collections-list")
    public String collectionsListMain(Model model) {
        Iterable<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "collections-list-main";
    }
}
