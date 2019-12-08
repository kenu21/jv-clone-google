package com.invest.service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.invest.entities.Page;
import org.springframework.data.domain.Pageable;

public interface PageService {
    Page index(String uri, int maxLevel, Set<String> set) throws IOException;

    List<Page> find(String query, Pageable pageable);
}
