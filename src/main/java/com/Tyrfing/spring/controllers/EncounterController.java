package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.utility.Encounter;
import com.Tyrfing.spring.services.EncounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class EncounterController {

    private EncounterService service;

    @Autowired
    public EncounterController(EncounterService service){
        this.service = service;
    }

    @GetMapping("/encounters")
    public ResponseEntity<Iterable<Encounter>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/encounters/{id}")
    public ResponseEntity<Encounter> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/encounters")
    public ResponseEntity<Encounter> create(@RequestBody Encounter encounter) {
        return new ResponseEntity<>(service.create(encounter), HttpStatus.CREATED);
    }

    @PutMapping("/encounters/{id}")
    public ResponseEntity<Encounter> update(@PathVariable Long id, @RequestBody Encounter encounter) {
        return new ResponseEntity<>(service.update(id, encounter), HttpStatus.OK);
    }

    @DeleteMapping("/encounters/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}
