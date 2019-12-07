package com.invest.controllers;

import java.io.IOException;
import java.util.HashSet;

import com.invest.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class Index {

    @Autowired
    private PageService pageService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam("q") String uri,
                         @RequestParam("level") Integer level, Model model) throws IOException {
        pageService.index(uri, level, new HashSet<String>());
        return "page2";
    }
}
