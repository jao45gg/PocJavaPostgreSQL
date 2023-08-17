package com.joao.PocJavPostgreSQL.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.PocJavPostgreSQL.classes.Hotel;
import com.joao.PocJavPostgreSQL.services.HotelsServices;

@RestController
@RequestMapping("hotels")
public class HotelsController {

    @Autowired
    private HotelsServices hotelsService;

    @GetMapping @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<List<Hotel>> getHotels() {
        return new ResponseEntity<List<Hotel>>(hotelsService.allHotels(), HttpStatus.OK);
    }

    @GetMapping(path = "/1") @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Optional<Hotel>> getOneHotel() {
        return new ResponseEntity<Optional<Hotel>>(hotelsService.oneHotel(), HttpStatus.OK);
    }

}
