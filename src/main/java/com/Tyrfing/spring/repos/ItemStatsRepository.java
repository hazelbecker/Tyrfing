package com.Tyrfing.spring.repos;

import com.Tyrfing.models.utility.ItemStats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemStatsRepository extends CrudRepository<ItemStats, Long> {
}
