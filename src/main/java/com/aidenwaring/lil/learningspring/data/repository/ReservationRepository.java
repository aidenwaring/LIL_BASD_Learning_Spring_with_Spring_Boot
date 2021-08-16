package com.aidenwaring.lil.learningspring.data.repository;

import com.aidenwaring.lil.learningspring.data.entity.Reservation;
import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
