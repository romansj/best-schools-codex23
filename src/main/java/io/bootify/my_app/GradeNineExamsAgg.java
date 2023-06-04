package io.bootify.my_app;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "grade_nine_exams_agg")
public class GradeNineExamsAgg {
    @Id
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "school_name", nullable = false)
    private String schoolName;

    @Column(name = "exam_9_eng", precision = 5, scale = 2)
    private BigDecimal exam9Eng;

    @Column(name = "exam_9_french", precision = 5, scale = 2)
    private BigDecimal exam9French;

    @Column(name = "exam_9_rus", precision = 5, scale = 2)
    private BigDecimal exam9Rus;

    @Column(name = "exam_9_latv", precision = 5, scale = 2)
    private BigDecimal exam9Latv;

    @Column(name = "exam_9_latv_hist", precision = 5, scale = 2)
    private BigDecimal exam9LatvHist;

    @Column(name = "exam_9_math", precision = 5, scale = 2)
    private BigDecimal exam9Math;

    @Column(name = "exam_9_rus_etnic", precision = 5, scale = 2)
    private BigDecimal exam9RusEtnic;

    @Column(name = "exam_9_polish_etnic", precision = 5, scale = 2)
    private BigDecimal exam9PolishEtnic;

    @Column(name = "exam_9_german", precision = 5, scale = 2)
    private BigDecimal exam9German;

    @Column(name = "count_9_eng")
    private Integer count9Eng;

    @Column(name = "count_9_french")
    private Integer count9French;

    @Column(name = "count_9_rus")
    private Integer count9Rus;

    @Column(name = "count_9_latv")
    private Integer count9Latv;

    @Column(name = "count_9_latv_hist")
    private Integer count9LatvHist;

    @Column(name = "count_9_math")
    private Integer count9Math;

    @Column(name = "count_9_rus_etnic")
    private Integer count9RusEtnic;

    @Column(name = "count_9_polish_etnic")
    private Integer count9PolishEtnic;

    @Column(name = "count_9_german")
    private Integer count9German;

}