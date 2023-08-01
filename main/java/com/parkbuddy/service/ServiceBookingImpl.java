package com.parkbuddy.service;

import com.parkbuddy.model.BookingVO;
import com.parkbuddy.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceBookingImpl implements ServiceBooking {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public <S extends BookingVO> S save(S entity) {
        return bookingRepository.save(entity);
    }

    @Override
    public <S extends BookingVO> Iterable<S> saveAll(Iterable<S> entities) {
        return bookingRepository.saveAll(entities);
    }

    @Override
    public Optional<BookingVO> findById(Integer integer) {
        return bookingRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return bookingRepository.existsById(integer);
    }

    @Override
    public Iterable<BookingVO> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Iterable<BookingVO> findAllById(Iterable<Integer> integers) {
        return bookingRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return bookingRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        bookingRepository.deleteById(integer);
    }

    @Override
    public void delete(BookingVO entity) {
        bookingRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        bookingRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends BookingVO> entities) {
        bookingRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        bookingRepository.deleteAll();
    }
}
