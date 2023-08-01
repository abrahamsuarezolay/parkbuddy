package com.parkbuddy.service;

import com.parkbuddy.model.ParkingSpaceVO;
import com.parkbuddy.repositories.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceParkingSpaceImpl implements ServiceParkingSpace {

    @Autowired
    ParkingSpaceRepository parkingSpaceRepository;

    @Override
    public <S extends ParkingSpaceVO> S save(S entity) {
        return parkingSpaceRepository.save(entity);
    }

    @Override
    public <S extends ParkingSpaceVO> Iterable<S> saveAll(Iterable<S> entities) {
        return parkingSpaceRepository.saveAll(entities);
    }

    @Override
    public Optional<ParkingSpaceVO> findById(Integer integer) {
        return parkingSpaceRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return parkingSpaceRepository.existsById(integer);
    }

    @Override
    public Iterable<ParkingSpaceVO> findAll() {
        return parkingSpaceRepository.findAll();
    }

    @Override
    public Iterable<ParkingSpaceVO> findAllById(Iterable<Integer> integers) {
        return parkingSpaceRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return parkingSpaceRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        parkingSpaceRepository.deleteById(integer);
    }

    @Override
    public void delete(ParkingSpaceVO entity) {
        parkingSpaceRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        parkingSpaceRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends ParkingSpaceVO> entities) {
        parkingSpaceRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        parkingSpaceRepository.deleteAll();
    }
}
