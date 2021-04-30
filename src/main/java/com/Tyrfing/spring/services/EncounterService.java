package com.Tyrfing.spring.services;

import com.Tyrfing.models.utility.Encounter;
import com.Tyrfing.spring.repos.EncounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterService {

    private EncounterRepository repo;

    @Autowired
    public EncounterService(EncounterRepository ec){
        this.repo = ec;
    }

    public Iterable<Encounter> index() {
        return this.repo.findAll();
    }

    public Encounter create(Encounter encounter) {
        return repo.save(encounter);
    }

    public Encounter read(Long id) {
        return repo.findById(id).get();
    }

    public Encounter update(Long id, Encounter data) {
        Encounter orig = read(id);
        orig.setEnemies(data.getEnemies());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
