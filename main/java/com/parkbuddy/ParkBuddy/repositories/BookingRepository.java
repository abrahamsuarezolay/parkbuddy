package com.parkbuddy.ParkBuddy.repositories;

import com.parkbuddy.ParkBuddy.model.BookingVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<BookingVO, Integer> {
}
