package io.bootify.my_app.schools.grades;

import io.bootify.my_app.GradeNineExams;
import io.bootify.my_app.GradeTwelveExams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    private final GradeNineRepository gradeNineRepo;

    private final GradeRepository gradeTwelveRepo;


    @Autowired
    public GradeService(GradeNineRepository gradeNineRepo, GradeRepository gradeTwelveRepo) {
        this.gradeNineRepo = gradeNineRepo;
        this.gradeTwelveRepo = gradeTwelveRepo;
    }

    List<GradeTwelveExams> findAll() {
        return gradeTwelveRepo.findAll();
    }

    List<GradeTwelveExams> findByAverageScoreGreaterThan(String minScore) {
        var doubleVal = Double.valueOf(minScore);
        return gradeTwelveRepo.findByAverageScoreGreaterThan(doubleVal);
    }

    List<GradeTwelveExams> findByExamNameLikeIgnoreCase(String examName) {
        return gradeTwelveRepo.findByExamNameLikeIgnoreCase(examName);
    }

    List<GradeTwelveExams> findBySchoolName(String schoolName) {
        return gradeTwelveRepo.findBySchoolNameLikeIgnoreCase(schoolName);
    }

    List<GradeTwelveExams> findByExamNameAndSchoolName(String examName, String schoolName) {
        return gradeTwelveRepo.findByExamNameLikeIgnoreCaseAndSchoolNameLikeIgnoreCase(examName, schoolName);
    }

    List<GradeTwelveExams> findByCountTakersGreaterThan(Integer minTakers) {
        return gradeTwelveRepo.findByCountTakersGreaterThan(minTakers);
    }

    // ****************************************************
    // ********************* GRADE NINE *******************
    // ****************************************************

    List<GradeNineExams> findAllGradeNine() {
        return gradeNineRepo.findAll();
    }

    List<GradeNineExams> findGradeNineByExamAndSchoolAndGrade(String school, String exam, Double totalScore) {
        return gradeNineRepo.findGradeNineByExamAndSchoolAndGrade(exam, school, totalScore);
    }

    List<GradeNineExams> findGradeNineByTotalScoreGreaterThan(Double minScore) {
        return gradeNineRepo.findByTotalScoreGreaterThan(minScore);
    }

    List<GradeNineExams> findGradeNineBySchoolNameLikeIgnoreCase(String schoolName) {
        return gradeNineRepo.findBySchoolNameLikeIgnoreCase(schoolName);
    }

    List<GradeNineExams> findGradeNineByByTestNameLikeIgnoreCase(String testName) {
        return gradeNineRepo.findByTestNameLikeIgnoreCase(testName);
    }

    List<GradeNineExams> findByTestNameAndSchoolName(String testName, String schoolName) {
        return gradeNineRepo.findByTestNameLikeIgnoreCaseAndSchoolNameLikeIgnoreCase(testName, schoolName);
    }

    List<GradeTwelveExams> findGradeByExamAndSchoolAndGrade(String school, String exam, Double totalScore) {
        return gradeTwelveRepo.findGradeByExamAndSchoolAndGrade(exam, school, totalScore);
    }
}