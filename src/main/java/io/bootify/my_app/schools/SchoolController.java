package io.bootify.my_app.schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService service;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.service = schoolService;
    }

    @GetMapping("/list")
    public List<School> getAll() {
        return service.getAll();
    }

    @GetMapping("/list/{location}")
    public List<School> getByLocation(@PathVariable String location) {
        return service.findSchoolsByLocation(location);
    }

    // Data providers could upload on their own
    // irl would validate and add to db
    @GetMapping("/csv")
    public List<School> addFromCSV() {
        return service.addFromCSV();
    }

    @PostMapping("/add")
    public void addSchool(@RequestBody School school) {
        service.addSchool(school);
    }


    // ******************************************************** //
    // ** PERSONNEL **
    // ******************************************************** //
    @GetMapping("/personnel")
    public List<SchoolPersonnel> getPersonnelData() {
        return service.getAllPersonnel();
    }

    @GetMapping("/personnel/county/{county}")
    public List<SchoolPersonnel> getPersonnelDataByCounty(@PathVariable String county) {
        return service.getPersonnelByCounty(county);
    }

    @GetMapping("/personnel/school/{school}")
    public List<SchoolPersonnel> getPersonnelDataBySchool(@PathVariable String school) {
        return service.getPersonnelBySchool(school);
    }


}
