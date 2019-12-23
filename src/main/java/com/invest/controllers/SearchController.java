package com.invest.controllers;

import java.util.List;

import com.invest.entities.Page;
import com.invest.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SearchController {

    @Autowired
    private PageService pageService;

    @GetMapping
    public String search() {
        return "page3";
    }

    @GetMapping("/finded")
    public String finded(@RequestParam(value = "q") String query,
                         @RequestParam(value = "page", required = false,
                                 defaultValue = "0") int page,
                         @RequestParam(value = "limit", required = false,
                                 defaultValue = "10") int limit,
                         @RequestParam(value = "sortBy", required = false,
                                 defaultValue = "title") String sortBy,
                         @RequestParam(value = "sortOrder", required = false,
                                 defaultValue = "asc") String sortOrder,
                         Model model) {
        Sort.Direction direction = Sort.Direction.fromString(sortOrder);
        Pageable pageRequest = PageRequest.of(page, limit, Sort.by(direction, sortBy));
        List<Page> pages = pageService.find(query, pageRequest);
        model.addAttribute("pages", pages);
        return "page4";
    }
}
