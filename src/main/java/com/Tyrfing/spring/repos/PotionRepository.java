package com.Tyrfing.spring.repos;

import com.Tyrfing.models.items.Potion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionRepository extends CrudRepository<Potion, Long> {
}
