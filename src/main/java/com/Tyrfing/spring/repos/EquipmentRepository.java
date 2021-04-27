package com.Tyrfing.spring.repos;

import com.Tyrfing.models.items.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Long> {
}
