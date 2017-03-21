package com.klb.service;

import java.util.List;

import com.klb.model.Book;
import com.klb.model.User;

public interface BookService {
	List<Book> findAll();
	Book findOne(Long id);
	void save(Book book);
	void delete(Long id);
	
}
