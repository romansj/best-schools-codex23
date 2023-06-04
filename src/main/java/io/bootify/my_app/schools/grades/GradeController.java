package io.bootify.my_app.schools.grades;

import io.bootify.my_app.GradeNineExams;
import io.bootify.my_app.GradeTwelveExams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/grades")
public class GradeController {

    private final GradeService service;

    @Autowired
    public GradeController(GradeService schoolService) {
        this.service = schoolService;
    }

    @GetMapping("/{level}/list")
    public ResponseEntity<?> getPupils(@PathVariable String level) {
        if ("9".equals(level)) {
            return ResponseEntity.ok().body(service.findAllGradeNine());
        }

        if ("12".equals(level)) {
            return ResponseEntity.ok().body(service.findAll());
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/9")
    public List<GradeNineExams> findGradeNineByExamAndSchoolAndGrade(@RequestParam(required = false) String testName, @RequestParam(required = false) String schoolName, @RequestParam(required = false) Double averageScore) {
        return service.findGradeNineByExamAndSchoolAndGrade(testName, schoolName, averageScore);
    }


    @GetMapping("/12")
    public List<GradeTwelveExams> findGradeTwelveByExamAndSchoolAndGrade(@RequestParam(required = false) String testName, @RequestParam(required = false) String schoolName, @RequestParam(required = false) Double averageScore) {
        return service.findGradeByExamAndSchoolAndGrade(testName, schoolName, averageScore);
    }


}
