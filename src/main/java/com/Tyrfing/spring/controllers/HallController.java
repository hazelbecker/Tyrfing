package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.areas.Hall;
import com.Tyrfing.spring.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HallController {

    private HallService service;

    @Autowired
    public HallController(HallService service){
        this.service = service;
    }

    @GetMapping("/halls")
    public ResponseEntity<Iterable<Hall>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/halls/{id}")
    public ResponseEntity<Hall> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/halls")
    public ResponseEntity<Hall> create(@RequestBody Hall hall) {
        return new ResponseEntity<>(service.create(hall), HttpStatus.CREATED);
    }

    @PutMapping("/halls/{id}")
    public ResponseEntity<Hall> update(@PathVariable Long id, @RequestBody Hall hall) {
        return new ResponseEntity<>(service.update(id, hall), HttpStatus.OK);
    }

    @DeleteMapping("/halls/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}