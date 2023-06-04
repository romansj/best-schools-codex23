package io.bootify.my_app.schools.ratings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<SchoolRating, Long> {

    @Query("select sr from SchoolRating sr "
            + "where (:schoolName is null or sr.schoolName like %:schoolName%) and"
            + "(:schoolType is null or sr.schoolType like %:schoolType%) and"
            + "(:rating is null or sr.rating >= :rating)" +
            "order by sr.rating desc")
    public List<SchoolRating> findSchoolRatingsBySchoolNameAndTypeAndRating(
            @Param("schoolName") String schoolName,
            @Param("schoolType") String schoolType,
            @Param("rating") BigDecimal rating
    );
}
