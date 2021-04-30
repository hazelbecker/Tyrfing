package com.Tyrfing.spring.services;

import com.Tyrfing.models.characters.Player;
import com.Tyrfing.spring.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private PlayerRepository repo;

    @Autowired
    public PlayerService(PlayerRepository ec){
        this.repo = ec;
    }

    public Iterable<Player> index() {
        return this.repo.findAll();
    }

    public Player create(Player enemy) {
        return repo.save(enemy);
    }

    public Player read(Long id) {
        return repo.findById(id).get();
    }

    public Player update(Long id, Player data) {
        Player orig = read(id);
        orig.setCurrentHealth(data.getCurrentHealth());
        orig.setDanger(data.getDanger());
        orig.setEndurance(data.getEndurance());
        orig.setHealth(data.getHealth());
        orig.setName(data.getName());
        orig.setPower(data.getPower());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
