package com.joao.PocJavPostgreSQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.PocJavPostgreSQL.classes.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    
}
