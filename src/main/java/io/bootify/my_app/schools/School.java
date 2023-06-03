package io.bootify.my_app.schools;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
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
    String latvianExam;

    @Column
    String englishExam;

    @Column
    String mathExam;

    @Column
    String schoolOfferMeals;

    @Column
    String activities;

    @Column
    String profileBasedLearning;

    @Column
    String schoolType;

    @Column
    String isRemote;

}
