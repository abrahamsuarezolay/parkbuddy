package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.UserRolVO;

import java.util.Optional;

public interface ServiceUserRol {
    <S extends UserRolVO> S save(S entity);

    <S extends UserRolVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<UserRolVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<UserRolVO> findAll();

    Iterable<UserRolVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(UserRolVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends UserRolVO> entities);

    void deleteAll();
}
