package com.parkbuddy.ParkBuddy.repositories;

import com.parkbuddy.ParkBuddy.model.RolVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<RolVO, Integer> {
}
