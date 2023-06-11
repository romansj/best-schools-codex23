package io.bootify.my_app.schools.ratings;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "school_ratings")
public class SchoolRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer place;

    private String schoolName;

    @Column(name = "rating", precision = 5, scale = 2)
    private BigDecimal rating;

    private String schoolType;

}