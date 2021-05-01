package com.Tyrfing.spring.services;

import com.Tyrfing.models.utility.Stats;
import com.Tyrfing.spring.repos.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {

    private StatsRepository repo;

    @Autowired
    public StatsService(StatsRepository ec){
        this.repo = ec;
    }

    public Iterable<Stats> index() {
        return this.repo.findAll();
    }

    public Stats create(Stats stats) {
        return repo.save(stats);
    }

    public Stats read(Long id) {
        return repo.findById(id).get();
    }

    public Stats update(Long id, Stats data) {
        Stats orig = read(id);
        orig.setDanger(data.getDanger());
        orig.setCurrentHealth(data.getCurrentHealth());
        orig.setEndurance(data.getEndurance());
        orig.setHealth(data.getHealth());
        orig.setPower(data.getPower());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}