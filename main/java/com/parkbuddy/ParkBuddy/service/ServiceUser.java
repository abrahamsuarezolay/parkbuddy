package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.UserVO;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface ServiceUser {
    <S extends UserVO> S save(S entity);

    <S extends UserVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<UserVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<UserVO> findAll();

    Iterable<UserVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(UserVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends UserVO> entities);

    void deleteAll();

    UserDetails findByUsername(String username);
}
