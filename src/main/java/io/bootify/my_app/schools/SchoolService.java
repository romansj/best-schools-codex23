package io.bootify.my_app.schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;


    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> getAll() {
        return schoolRepository.findAll();
    }

    public List<School> findSchoolsByLocation(String location) {
        return schoolRepository.findSchoolsByLocation(location);
    }


    public void addDisease(School disease) {
        schoolRepository.save(disease);
    }


    public List<School> addFromCSV() {
        File file = new File(getClass().getResource("/schools.csv").getFile());
        List<SchoolPojo> schoolPojos;
        try {
            schoolPojos = SchoolReader.readFile(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<School> schools = new ArrayList<>();
        for (SchoolPojo schoolPojo : schoolPojos) {
            School map = map(schoolPojo);
            schools.add(map);
        }


        return schools;
    }

    School map(SchoolPojo pojo) {
        School school = new School();
        school.setName(pojo.name());
        school.setActivities(pojo.activities());
        school.setEnglishExam(pojo.en_exam());
        school.setWebsite(pojo.website());
        school.setLocation(pojo.location());
        return school;
    }
}