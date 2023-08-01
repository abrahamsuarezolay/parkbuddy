package com.parkbuddy.repositories;

import com.parkbuddy.model.UserVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {
}
