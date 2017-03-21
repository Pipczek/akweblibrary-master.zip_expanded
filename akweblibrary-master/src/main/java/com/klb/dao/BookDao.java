package com.klb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klb.model.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {
}
