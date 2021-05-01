package com.Tyrfing.spring.repos;

import com.Tyrfing.models.areas.Hall;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends CrudRepository<Hall, Long> {
}
