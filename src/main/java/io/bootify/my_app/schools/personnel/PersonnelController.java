package io.bootify.my_app.schools.personnel;

import io.bootify.my_app.schools.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/personnel")
public class PersonnelController {

    private final SchoolService service;

    @Autowired
    public PersonnelController(SchoolService schoolService) {
        this.service = schoolService;
    }


    @GetMapping("/list")
    public List<SchoolPersonnel> getPersonnelData() {
        return service.getAllPersonnel();
    }

    @GetMapping("/county/{county}")
    public List<SchoolPersonnel> getPersonnelDataByCounty(@PathVariable String county) {
        return service.getPersonnelByCounty(county);
    }

    @GetMapping("/school/{school}")
    public List<SchoolPersonnel> getPersonnelDataBySchool(@PathVariable String school) {
        return service.getPersonnelBySchool(school);
    }


}
