package com.Tyrfing.spring.repos;

import com.Tyrfing.models.utility.Stats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends CrudRepository<Stats, Long> {
}
