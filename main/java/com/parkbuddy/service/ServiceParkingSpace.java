package com.parkbuddy.service;

import com.parkbuddy.model.ParkingSpaceVO;

import java.util.Optional;

public interface ServiceParkingSpace {
    <S extends ParkingSpaceVO> S save(S entity);

    <S extends ParkingSpaceVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<ParkingSpaceVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<ParkingSpaceVO> findAll();

    Iterable<ParkingSpaceVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(ParkingSpaceVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends ParkingSpaceVO> entities);

    void deleteAll();
}
