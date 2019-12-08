package com.invest.repositories;

import java.util.List;

import com.invest.entities.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Long> {
    List<Page> findAllByBody(String body, Pageable pageable);
}
