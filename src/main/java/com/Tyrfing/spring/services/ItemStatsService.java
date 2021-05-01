package com.Tyrfing.spring.services;

import com.Tyrfing.models.utility.ItemStats;
import com.Tyrfing.spring.repos.ItemStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemStatsService {

    private ItemStatsRepository repo;

    @Autowired
    public ItemStatsService(ItemStatsRepository ec){
        this.repo = ec;
    }

    public Iterable<ItemStats> index() {
        return this.repo.findAll();
    }

    public ItemStats create(ItemStats itemStats) {
        return repo.save(itemStats);
    }

    public ItemStats read(Long id) {
        return repo.findById(id).get();
    }

    public ItemStats update(Long id, ItemStats data) {
        ItemStats orig = read(id);
        orig.setDangerMod(data.getDangerMod());
        orig.setEnduranceMod(data.getEnduranceMod());
        orig.setPowerMod(data.getPowerMod());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}
