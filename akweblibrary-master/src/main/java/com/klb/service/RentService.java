package com.klb.service;


import java.util.List;

import com.klb.model.Book;
import com.klb.model.Rent;
import com.klb.model.User;

public interface RentService {

    void createRent(User user, Book book);
    List<Rent> findByUserOrderByCreatedDateDesc(User user);
    List<Rent> findAll();
}
