package io.bootify.my_app.schools.exams;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grade_twelve_exams")
public class GradeTwelveExams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "county_code")
    private Short countyCode;


    @Column(name = "school_name")
    private String schoolName;


    @Column(name = "exam_name")
    private String examName;

    @Column(name = "average_score")
    private Double averageScore;

    @Column(name = "count_takers")
    private Integer countTakers;

    @Column(name = "below_five_percent")
    private Integer belowFivePercent;

    @Column(name = "five_to_nine_percent")
    private Integer fiveToNinePercent;

    @Column(name = "ten_to_nineteen_percent")
    private Integer tenToNineteenPercent;

    @Column(name = "twenty_to_twentynine_percent")
    private Integer twentyToTwentyninePercent;

    @Column(name = "thirty_to_thirty_nine")
    private Integer thirtyToThirtyNine;

    @Column(name = "fourty_to_fourty_nine")
    private Integer fourtyToFourtyNine;

    @Column(name = "fifty_to_fifty_nine")
    private Integer fiftyToFiftyNine;

    @Column(name = "sixty_to_sixty_nine")
    private Integer sixtyToSixtyNine;

    @Column(name = "seventy_to_seventy_nine")
    private Integer seventyToSeventyNine;

    @Column(name = "eighty_to_eighty_nine")
    private Integer eightyToEightyNine;

    @Column(name = "ninety_to_hundred")
    private Integer ninetyToHundred;

    @Column(name = "year")
    private Short year;

}