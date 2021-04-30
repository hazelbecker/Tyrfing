package com.Tyrfing.spring.repos;

import com.Tyrfing.models.utility.Encounter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends CrudRepository<Encounter, Long> {
}
