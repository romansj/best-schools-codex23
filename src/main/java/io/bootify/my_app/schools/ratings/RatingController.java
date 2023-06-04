package io.bootify.my_app.schools.ratings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/ratings")
public class RatingController {

    private final RatingService service;

    @Autowired
    public RatingController(RatingService schoolService) {
        this.service = schoolService;
    }

    @GetMapping("/list")
    public List<SchoolRating> getAll() {
        return service.getAll();
    }

    @GetMapping("/")
    public List<SchoolRating> findSchoolRatingsBySchoolNameAndTypeAndRating(@RequestParam(required = false) String schoolName, @RequestParam(required = false)String schoolType, @RequestParam(required = false) BigDecimal rating) {
        return service.findSchoolRatingsBySchoolNameAndTypeAndRating(schoolName, schoolType, rating);
    }


}
