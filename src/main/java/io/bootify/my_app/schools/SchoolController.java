package io.bootify.my_app.schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService service;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.service = schoolService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<School> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public void addDisease(@RequestBody School disease) {
        service.addDisease(disease);
    }
}
