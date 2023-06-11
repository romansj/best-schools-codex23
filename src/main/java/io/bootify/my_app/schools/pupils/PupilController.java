package io.bootify.my_app.schools.pupils;

import io.bootify.my_app.schools.SchoolService;
import io.bootify.my_app.schools.pupils.models.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/pupils")
public class PupilController {

    private final SchoolService service;

    @Autowired
    public PupilController(SchoolService schoolService) {
        this.service = schoolService;
    }

    @GetMapping("/list")
    public List<Record> getPupils() {
        return service.getAllPupils();
    }

    @GetMapping("/county/{county}")
    public List<Record> getPupilsByCounty(@PathVariable String county) {
        return service.getPupilsByCounty(county);
    }

    @GetMapping("/school/{school}")
    public List<Record> getPupilsBySchool(@PathVariable String school) {
        return service.getPupilsBySchool(school);
    }


}
