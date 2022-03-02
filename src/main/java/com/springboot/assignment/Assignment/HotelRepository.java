package com.springboot.assignment.Assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.assignment.Assignment.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {

}

