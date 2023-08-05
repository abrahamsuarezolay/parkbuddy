package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.RolVO;
import com.parkbuddy.ParkBuddy.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceRolImpl implements ServiceRol {

    @Autowired
    RolRepository rolRepository;

    @Override
    public <S extends RolVO> S save(S entity) {
        return rolRepository.save(entity);
    }

    @Override
    public <S extends RolVO> Iterable<S> saveAll(Iterable<S> entities) {
        return rolRepository.saveAll(entities);
    }

    @Override
    public Optional<RolVO> findById(Integer integer) {
        return rolRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return rolRepository.existsById(integer);
    }

    @Override
    public Iterable<RolVO> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Iterable<RolVO> findAllById(Iterable<Integer> integers) {
        return rolRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return rolRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        rolRepository.deleteById(integer);
    }

    @Override
    public void delete(RolVO entity) {
        rolRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        rolRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends RolVO> entities) {
        rolRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        rolRepository.deleteAll();
    }
}
