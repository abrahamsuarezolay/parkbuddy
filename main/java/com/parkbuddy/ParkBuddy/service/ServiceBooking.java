package com.parkbuddy.ParkBuddy.service;

import com.parkbuddy.ParkBuddy.model.BookingVO;

import java.util.Optional;

public interface ServiceBooking {
    <S extends BookingVO> S save(S entity);

    <S extends BookingVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<BookingVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<BookingVO> findAll();

    Iterable<BookingVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(BookingVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends BookingVO> entities);

    void deleteAll();
}
