package com.patterns.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollectionsListController {

    @GetMapping("/collections-list")
    public String collectionsListMain(Model model) {
        return "collections-list-main";
    }
}
