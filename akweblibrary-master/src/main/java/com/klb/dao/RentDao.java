package com.klb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klb.model.Rent;
import com.klb.model.User;

import java.util.List;

@Repository
public interface RentDao extends JpaRepository<Rent, Long> {

    List<Rent> findByUserOrderByCreatedDateDesc(User user);

}
