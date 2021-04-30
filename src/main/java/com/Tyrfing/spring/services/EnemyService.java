package com.Tyrfing.spring.services;

import com.Tyrfing.models.characters.Enemy;
import com.Tyrfing.spring.repos.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnemyService {

    private EnemyRepository repo;

    @Autowired
    public EnemyService(EnemyRepository ec){
        this.repo = ec;
    }

    public Iterable<Enemy> index() {
        return this.repo.findAll();
    }

    public Enemy create(Enemy enemy) {
        return repo.save(enemy);
    }

    public Enemy read(Long id) {
        return repo.findById(id).get();
    }

    public Enemy update(Long id, Enemy data) {
        Enemy orig = read(id);
        orig.setCurrentHealth(data.getCurrentHealth());
        orig.setDanger(data.getDanger());
        orig.setEndurance(data.getEndurance());
        orig.setHealth(data.getHealth());
        orig.setPower(data.getPower());
        orig.setName(data.getName());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
