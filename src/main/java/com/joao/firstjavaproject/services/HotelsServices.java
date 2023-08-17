package com.joao.firstjavaproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.firstjavaproject.classes.Hotel;
import com.joao.firstjavaproject.repositories.HotelRepository;

@Service
public class HotelsServices {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> allHotels() {
        List<Hotel> test = hotelRepository.findAll();
        System.out.println(test);
        return test;
    }

    public Optional<Hotel> oneHotel() {
        return hotelRepository.findById(1);
    }
}
