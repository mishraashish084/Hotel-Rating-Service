package com.Learn.hotel.services;

import com.Learn.hotel.entities.Hotel;
import java.util.List;

public interface HotelService {
    // Create a new hotel
    Hotel create(Hotel hotel);

    // Get a hotel by its ID
    Hotel getHotel(String id);

    // Get all hotels
    List<Hotel> getAllHotels();

    // Update hotel details
    Hotel updateHotel(String id, Hotel hotel);

    // Delete a hotel by its ID
    void deleteHotel(String id);
}
