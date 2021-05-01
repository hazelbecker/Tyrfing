package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.utility.ItemStats;
import com.Tyrfing.spring.services.ItemStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ItemStatsController {

    private ItemStatsService service;

    @Autowired
    public ItemStatsController(ItemStatsService service){
        this.service = service;
    }

    @GetMapping("/itemstatss")
    public ResponseEntity<Iterable<ItemStats>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/itemstatss/{id}")
    public ResponseEntity<ItemStats> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/itemstatss")
    public ResponseEntity<ItemStats> create(@RequestBody ItemStats itemStats) {
        return new ResponseEntity<>(service.create(itemStats), HttpStatus.CREATED);
    }

    @PutMapping("/itemstatss/{id}")
    public ResponseEntity<ItemStats> update(@PathVariable Long id, @RequestBody ItemStats itemStats) {
        return new ResponseEntity<>(service.update(id, itemStats), HttpStatus.OK);
    }

    @DeleteMapping("/itemstatss/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}
