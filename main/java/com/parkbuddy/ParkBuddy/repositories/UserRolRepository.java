package com.parkbuddy.ParkBuddy.repositories;

import com.parkbuddy.ParkBuddy.model.UserRolVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolRepository extends CrudRepository<UserRolVO, Integer> {
}
