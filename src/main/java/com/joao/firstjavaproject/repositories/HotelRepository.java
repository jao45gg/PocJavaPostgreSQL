package com.joao.firstjavaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.firstjavaproject.classes.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    
}
