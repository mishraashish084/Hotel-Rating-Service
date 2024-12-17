package com.Learn.hotel.services;

import com.Learn.hotel.entities.Hotel;
import com.Learn.hotel.exceptions.ResourceNotFoundException;
import com.Learn.hotel.repositories.HotelRepository;
import com.Learn.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    // Create a new hotel
    @Override
    public Hotel create(Hotel hotel) {
        // Save hotel to the database and return the saved hotel
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    // Get a hotel by its ID
    @Override
    public Hotel getHotel(String id) {
        // Find the hotel by ID, if not found throw an exception
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: " + id));
    }

    // Get all hotels
    @Override
    public List<Hotel> getAllHotels() {
        // Return a list of all hotels from the database
        return hotelRepository.findAll();
    }

    // Update hotel details
    @Override
    public Hotel updateHotel(String id, Hotel hotel) {
        // Check if the hotel exists, if not throw an exception
        Hotel existingHotel = hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: " + id));

        // Update the hotel details
        existingHotel.setName(hotel.getName());
        existingHotel.setLocation(hotel.getLocation());
      //  existingHotel.setRating(hotel.getRating());

        // Save the updated hotel to the database
        return hotelRepository.save(existingHotel);
    }

    // Delete a hotel by its ID
    @Override
    public void deleteHotel(String id) {
        // Check if the hotel exists, if not throw an exception
        Hotel existingHotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: " + id));

        // Delete the hotel from the database
        hotelRepository.delete(existingHotel);
    }
}
