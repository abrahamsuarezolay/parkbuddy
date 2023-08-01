package com.parkbuddy.ParkBuddy.repositories;

import com.parkbuddy.ParkBuddy.model.ParkingSpaceVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParkingSpaceRepository extends CrudRepository<ParkingSpaceVO, Integer> {

    Optional<List<ParkingSpaceVO>> findByLocation(String location);
}
