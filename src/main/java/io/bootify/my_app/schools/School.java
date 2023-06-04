package io.bootify.my_app.schools;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "school")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    String website;

    @Column
    private String location;

    @Column
    String activities;

    @Size(max = 255)
    @Column(name = "english_exam")
    private String englishExam;

    @Size(max = 255)
    @Column(name = "is_remote")
    private String isRemote;

    @Size(max = 255)
    @Column(name = "latvian_exam")
    private String latvianExam;

    @Size(max = 255)
    @Column(name = "math_exam")
    private String mathExam;

    @Size(max = 1)
    @Column(name = "profile_based_learning", length = 1)
    private String profileBasedLearning;

    @Size(max = 1)
    @Column(name = "school_offer_meals", length = 1)
    private String schoolOfferMeals;

    @Size(max = 1)
    @Column(name = "school_type", length = 1)
    private String schoolType;

}
