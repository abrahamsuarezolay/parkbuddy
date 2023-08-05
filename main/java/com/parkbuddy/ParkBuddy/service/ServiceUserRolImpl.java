package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.UserRolVO;
import com.parkbuddy.ParkBuddy.repositories.UserRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUserRolImpl implements ServiceUserRol {

    @Autowired
    UserRolRepository userRol;

    @Override
    public <S extends UserRolVO> S save(S entity) {
        return userRol.save(entity);
    }

    @Override
    public <S extends UserRolVO> Iterable<S> saveAll(Iterable<S> entities) {
        return userRol.saveAll(entities);
    }

    @Override
    public Optional<UserRolVO> findById(Integer integer) {
        return userRol.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return userRol.existsById(integer);
    }

    @Override
    public Iterable<UserRolVO> findAll() {
        return userRol.findAll();
    }

    @Override
    public Iterable<UserRolVO> findAllById(Iterable<Integer> integers) {
        return userRol.findAllById(integers);
    }

    @Override
    public long count() {
        return userRol.count();
    }

    @Override
    public void deleteById(Integer integer) {
        userRol.deleteById(integer);
    }

    @Override
    public void delete(UserRolVO entity) {
        userRol.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        userRol.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends UserRolVO> entities) {
        userRol.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRol.deleteAll();
    }
}
