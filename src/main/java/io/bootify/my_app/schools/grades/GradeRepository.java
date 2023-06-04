package io.bootify.my_app.schools.grades;

import io.bootify.my_app.GradeNineExams;
import io.bootify.my_app.GradeTwelveExams;
import io.bootify.my_app.schools.pupils.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<GradeTwelveExams, Long> {
    List<GradeTwelveExams> findByAverageScoreGreaterThan(Double minScore);
    List<GradeTwelveExams> findByCountTakersGreaterThan(Integer minTakers);

    List<GradeTwelveExams> findBySchoolNameLikeIgnoreCase(String testName);

    List<GradeTwelveExams> findByExamNameLikeIgnoreCase(String testName);

    List<GradeTwelveExams> findByExamNameLikeIgnoreCaseAndSchoolNameLikeIgnoreCase(String testName, String schoolName);

    @Query("select ex from GradeTwelveExams ex "
            + "where (:schoolName is null or ex.schoolName like :schoolName) and"
            + "(:testName is null or ex.examName like :testName) and"
            + "(:totalScore is null or ex.averageScore >= :totalScore)")
    public List<GradeTwelveExams> findGradeByExamAndSchoolAndGrade(
            @Param("testName") String testName,
            @Param("schoolName") String schoolName,
            @Param("totalScore") Double totalScore
    );


}
