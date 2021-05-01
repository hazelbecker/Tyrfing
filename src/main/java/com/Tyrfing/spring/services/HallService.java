package com.Tyrfing.spring.services;

import com.Tyrfing.models.areas.Hall;
import com.Tyrfing.spring.repos.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallService {

    private HallRepository repo;

    @Autowired
    public HallService(HallRepository ec){
        this.repo = ec;
    }

    public Iterable<Hall> index() {
        return this.repo.findAll();
    }

    public Hall create(Hall hall) {
        return repo.save(hall);
    }

    public Hall read(Long id) {
        return repo.findById(id).get();
    }

    public Hall update(Long id, Hall data) {
        Hall orig = read(id);
        orig.setEncounter(data.getEncounter());
        orig.setHiddenPathId(data.getHiddenPathId());
        orig.setPathHidden(data.isPathHidden());
        orig.setPrevId(data.getPrevId());
        orig.setSidePathId(data.getSidePathId());
        orig.setStraightPathId(data.getStraightPathId());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
