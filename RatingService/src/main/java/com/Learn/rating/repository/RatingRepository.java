package com.Learn.rating.repository;

import com.Learn.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {
    //Custom finder Method
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
