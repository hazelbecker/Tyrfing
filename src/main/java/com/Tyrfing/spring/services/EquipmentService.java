package com.Tyrfing.spring.services;

import com.Tyrfing.models.items.Equipment;
import com.Tyrfing.spring.repos.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {

    private EquipmentRepository repo;

    @Autowired
    public EquipmentService(EquipmentRepository ec){
        this.repo = ec;
    }

    public Iterable<Equipment> index() {
        return this.repo.findAll();
    }

    public Equipment create(Equipment equipment) {
        return repo.save(equipment);
    }

    public Equipment read(Long id) {
        return repo.findById(id).get();
    }

    public Equipment update(Long id, Equipment data) {
        Equipment orig = read(id);
        orig.setEquipmentType(data.getEquipmentType());
        orig.setItemStats(data.getItemStats());
        return create(orig);
    }

    public Boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

}