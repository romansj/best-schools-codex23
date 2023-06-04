package io.bootify.my_app.schools.ratings;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
    private Integer id;

    @Column(name = "place")
    private Integer place;

    @Size(max = 100)
    @Column(name = "school_name", length = 100)
    private String schoolName;

    @Column(name = "rating", precision = 5, scale = 2)
    private BigDecimal rating;

    @Size(max = 20)
    @Column(name = "school_type", length = 20)
    private String schoolType;

}