package com.parkbuddy.repositories;

import com.parkbuddy.model.ParkingSpaceVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpaceRepository extends CrudRepository<ParkingSpaceVO, Integer> {
}
