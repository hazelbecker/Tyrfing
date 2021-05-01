package com.Tyrfing.spring.services;

import com.Tyrfing.models.utility.Inventory;
import com.Tyrfing.spring.repos.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private InventoryRepository repo;

    @Autowired
    public InventoryService(InventoryRepository ec){
        this.repo = ec;
    }

    public Iterable<Inventory> index() {
        return this.repo.findAll();
    }

    public Inventory create(Inventory inventory) {
        return repo.save(inventory);
    }

    public Inventory read(Long id) {
        return repo.findById(id).get();
    }

    public Inventory update(Long id, Inventory data) {
        Inventory orig = read(id);
        orig.setItems(data.getItems());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}

