package com.Learn.hotel.repositories;

import com.Learn.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
