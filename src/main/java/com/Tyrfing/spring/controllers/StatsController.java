package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.utility.Stats;
import com.Tyrfing.spring.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StatsController {

    private StatsService service;

    @Autowired
    public StatsController(StatsService service){
        this.service = service;
    }

    @GetMapping("/statss")
    public ResponseEntity<Iterable<Stats>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/statss/{id}")
    public ResponseEntity<Stats> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/statss")
    public ResponseEntity<Stats> create(@RequestBody Stats stats) {
        return new ResponseEntity<>(service.create(stats), HttpStatus.CREATED);
    }

    @PutMapping("/statss/{id}")
    public ResponseEntity<Stats> update(@PathVariable Long id, @RequestBody Stats stats) {
        return new ResponseEntity<>(service.update(id, stats), HttpStatus.OK);
    }

    @DeleteMapping("/statss/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}