package com.invest.service;

import java.io.IOException;
import java.util.Set;

import com.invest.entities.Page;

public interface PageService {
    Page index(String uri, int maxLevel, Set<String> set) throws IOException;
}
