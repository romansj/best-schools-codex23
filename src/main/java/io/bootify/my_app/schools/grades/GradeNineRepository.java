package io.bootify.my_app.schools.grades;

import io.bootify.my_app.schools.exams.GradeNineExams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeNineRepository extends JpaRepository<GradeNineExams, JpaSpecificationExecutor<GradeNineExams>> {
    List<GradeNineExams> findBySchoolNameLikeIgnoreCase(String school);
    List<GradeNineExams> findByTestNameLikeIgnoreCase(String testName);
    List<GradeNineExams> findByTestNameLikeIgnoreCaseAndSchoolNameLikeIgnoreCase(String testName, String schoolName);
    List<GradeNineExams> findByTotalScoreGreaterThan(Double totalScore);
    List<GradeNineExams> findByExamTakersCountGreaterThan(Integer minTakers);

    @Query("select ex from GradeNineExams ex "
            + "where (:schoolName is null or ex.schoolName like %:schoolName%) and"
            + "(:testName is null or ex.testName like %:testName%) and"
            + "(:totalScore is null or ex.totalScore >= :totalScore)")
    public List<GradeNineExams> findGradeNineByExamAndSchoolAndGrade(
            @Param("testName") String testName,
            @Param("schoolName") String schoolName,
            @Param("totalScore") Double totalScore
    );
}
