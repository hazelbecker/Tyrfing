package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.items.Equipment;
import com.Tyrfing.spring.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EquipmentController {

    private EquipmentService service;

    @Autowired
    public EquipmentController(EquipmentService service){
        this.service = service;
    }

    @GetMapping("/equipments")
    public ResponseEntity<Iterable<Equipment>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/equipments/{id}")
    public ResponseEntity<Equipment> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/equipments")
    public ResponseEntity<Equipment> create(@RequestBody Equipment equipment) {
        return new ResponseEntity<>(service.create(equipment), HttpStatus.CREATED);
    }

    @PutMapping("/equipments/{id}")
    public ResponseEntity<Equipment> update(@PathVariable Long id, @RequestBody Equipment equipment) {
        return new ResponseEntity<>(service.update(id, equipment), HttpStatus.OK);
    }

    @DeleteMapping("/equipments/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}