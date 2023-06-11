package io.bootify.my_app.schools.exams;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grade_nine_exams")
public class GradeNineExams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "test_name", length = 20)
    private String testName;


    @Column(name = "school_name", length = 50)
    private String schoolName;


    @Column(name = "total_score")
    private Double totalScore;

    @Column(name = "taker_count", length = 5)
    private Integer examTakersCount;

    @Column(name = "year")
    private Short year;

}