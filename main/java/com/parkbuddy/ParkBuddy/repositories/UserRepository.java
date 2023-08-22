package com.parkbuddy.ParkBuddy.repositories;

import com.parkbuddy.ParkBuddy.model.UserVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {

    UserDetails findByUsername(String username);
}
