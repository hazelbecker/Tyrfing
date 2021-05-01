package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.utility.Inventory;
import com.Tyrfing.spring.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InventoryController {

    private InventoryService service;

    @Autowired
    public InventoryController(InventoryService service){
        this.service = service;
    }

    @GetMapping("/inventorys")
    public ResponseEntity<Iterable<Inventory>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/inventorys/{id}")
    public ResponseEntity<Inventory> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/inventorys")
    public ResponseEntity<Inventory> create(@RequestBody Inventory inventory) {
        return new ResponseEntity<>(service.create(inventory), HttpStatus.CREATED);
    }

    @PutMapping("/inventorys/{id}")
    public ResponseEntity<Inventory> update(@PathVariable Long id, @RequestBody Inventory inventory) {
        return new ResponseEntity<>(service.update(id, inventory), HttpStatus.OK);
    }

    @DeleteMapping("/inventorys/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}