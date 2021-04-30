package com.Tyrfing.spring.controllers;

import com.Tyrfing.models.characters.Player;
import com.Tyrfing.spring.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PlayerController {

    private PlayerService service;

    @Autowired
    public PlayerController(PlayerService service){
        this.service = service;
    }

    @GetMapping("/players")
    public ResponseEntity<Iterable<Player>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @GetMapping("/players/{id}")
    public ResponseEntity<Player> read(@PathVariable long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/players")
    public ResponseEntity<Player> create(@RequestBody Player player) {
        return new ResponseEntity<>(service.create(player), HttpStatus.CREATED);
    }

    @PutMapping("/players/{id}")
    public ResponseEntity<Player> update(@PathVariable Long id, @RequestBody Player player) {
        return new ResponseEntity<>(service.update(id, player), HttpStatus.OK);
    }

    @DeleteMapping("/players/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

}