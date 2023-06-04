package io.bootify.my_app.schools.ratings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;


    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<SchoolRating> getAll() {
        return ratingRepository.findAll();
    }

    public List<SchoolRating> findSchoolRatingsBySchoolNameAndTypeAndRating(String  school, String type, BigDecimal rating) {
        return ratingRepository.findSchoolRatingsBySchoolNameAndTypeAndRating(school, type, rating);
    }
}