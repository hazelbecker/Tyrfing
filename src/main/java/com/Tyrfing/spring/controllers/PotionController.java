package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.items.Potion;
import com.Tyrfing.spring.services.PotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PotionController {

    private PotionService service;

    @Autowired
    public PotionController(PotionService service){
        this.service = service;
    }

    @GetMapping("/potions")
    public ResponseEntity<Iterable<Potion>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/potions/{id}")
    public ResponseEntity<Potion> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/potions")
    public ResponseEntity<Potion> create(@RequestBody Potion potion) {
        return new ResponseEntity<>(service.create(potion), HttpStatus.CREATED);
    }

    @PutMapping("/potions/{id}")
    public ResponseEntity<Potion> update(@PathVariable Long id, @RequestBody Potion potion) {
        return new ResponseEntity<>(service.update(id, potion), HttpStatus.OK);
    }

    @DeleteMapping("/potions/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}