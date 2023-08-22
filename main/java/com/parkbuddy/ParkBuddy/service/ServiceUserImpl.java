package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.UserVO;
import com.parkbuddy.ParkBuddy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceUserImpl implements ServiceUser {

    @Autowired
    UserRepository userRepository;

    @Override
    public <S extends UserVO> S save(S entity) {
        try {
            return userRepository.save(entity);
        }catch(DataIntegrityViolationException e){
            return entity;
        }
    }

    @Override
    public <S extends UserVO> Iterable<S> saveAll(Iterable<S> entities) {
        return userRepository.saveAll(entities);
    }

    @Override
    public Optional<UserVO> findById(Integer integer) {
        return userRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return userRepository.existsById(integer);
    }

    @Override
    public Iterable<UserVO> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<UserVO> findAllById(Iterable<Integer> integers) {
        return userRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        userRepository.deleteById(integer);
    }

    @Override
    public void delete(UserVO entity) {
        userRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        userRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends UserVO> entities) {
        userRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

    public UserDetails findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
