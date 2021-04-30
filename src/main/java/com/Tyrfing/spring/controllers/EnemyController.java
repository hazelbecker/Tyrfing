package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.characters.Enemy;
import com.Tyrfing.spring.services.EnemyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class EnemyController {

    private EnemyService service;

    @Autowired
    public EnemyController(EnemyService service){
        this.service = service;
    }

    @GetMapping("/enemys")
    public ResponseEntity<Iterable<Enemy>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/enemys/{id}")
    public ResponseEntity<Enemy> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/enemys")
    public ResponseEntity<Enemy> create(@RequestBody Enemy enemy) {
        return new ResponseEntity<>(service.create(enemy), HttpStatus.CREATED);
    }

    @PutMapping("/enemys/{id}")
    public ResponseEntity<Enemy> update(@PathVariable Long id, @RequestBody Enemy enemy) {
        return new ResponseEntity<>(service.update(id, enemy), HttpStatus.OK);
    }

    @DeleteMapping("/enemys/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}