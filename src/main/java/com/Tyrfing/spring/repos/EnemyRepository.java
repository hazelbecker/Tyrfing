package com.Tyrfing.spring.repos;

import com.Tyrfing.models.characters.Enemy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends CrudRepository<Enemy, Long> {
}