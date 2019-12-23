package com.invest.controllers;

import java.io.IOException;
import java.util.HashSet;

import com.invest.entities.Page;
import com.invest.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private PageService pageService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/abra")
    public String submit(@RequestParam("q") String uri,
                         @RequestParam("level") Integer level) throws IOException {
        pageService.index(uri, level, new HashSet<String>());
        return "page2";
    }
}
