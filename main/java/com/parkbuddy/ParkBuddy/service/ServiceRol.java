package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.RolVO;

import java.util.Optional;

public interface ServiceRol {
    <S extends RolVO> S save(S entity);

    <S extends RolVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<RolVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<RolVO> findAll();

    Iterable<RolVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(RolVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends RolVO> entities);

    void deleteAll();
}
