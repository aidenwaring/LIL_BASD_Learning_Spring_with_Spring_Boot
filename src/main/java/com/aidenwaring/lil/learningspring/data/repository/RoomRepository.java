package com.aidenwaring.lil.learningspring.data.repository;

import com.aidenwaring.lil.learningspring.data.entity.Reservation;
import com.aidenwaring.lil.learningspring.data.entity.Room;
import java.sql.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
