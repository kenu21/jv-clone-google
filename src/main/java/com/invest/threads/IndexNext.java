package com.invest.threads;

import java.util.Set;

import com.invest.service.PageService;
import lombok.SneakyThrows;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexNext implements Runnable {

    @Autowired
    private PageService pageService;
    private Set<String> set;
    private Elements links;
    private int level;

    public IndexNext(Set<String> set, Elements links, int level) {
        this.set = set;
        this.links = links;
        this.level = level;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (Element link : links) {
            pageService.index(link.attr("abs:href"), level, set);
        }
    }
}
