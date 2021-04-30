package com.Tyrfing.spring.services;

import com.Tyrfing.models.items.Potion;
import com.Tyrfing.spring.repos.PotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PotionService {

    private PotionRepository repo;

    @Autowired
    public PotionService(PotionRepository ec){
        this.repo = ec;
    }

    public Iterable<Potion> index() {
        return this.repo.findAll();
    }

    public Potion create(Potion enemy) {
        return repo.save(enemy);
    }

    public Potion read(Long id) {
        return repo.findById(id).get();
    }

    public Potion update(Long id, Potion data) {
        Potion orig = read(id);
        orig.setDangerMod(data.getDangerMod());
        orig.setCurrentHealthMod(orig.getCurrentHealthMod());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
