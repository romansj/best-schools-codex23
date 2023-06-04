package io.bootify.my_app.schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    private final PersonnelRepository personnelRepository;


    @Autowired
    public SchoolService(SchoolRepository schoolRepository, PersonnelRepository personnelRepository) {
        this.schoolRepository = schoolRepository;
        this.personnelRepository = personnelRepository;
    }

    public List<School> getAll() {
        return schoolRepository.findAll();
    }

    public List<School> findSchoolsByLocation(String location) {
        return schoolRepository.findSchoolsByLocation(location);
    }


    public void addSchool(School disease) {
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

        schoolRepository.saveAll(schools);


        return schools;
    }

    School map(SchoolPojo pojo) {
        School school = new School();
        school.setName(pojo.name());
        school.setWebsite(pojo.website());
        school.setLocation(pojo.location());
        school.setLatvianExam(pojo.lv_exam());
        school.setEnglishExam(pojo.en_exam());
        school.setMathExam(pojo.math_exam());
        school.setSchoolOfferMeals(pojo.school_lunches());
        school.setProfileBasedLearning(pojo.profile_based_learning());
        school.setSchoolType(pojo.school_type());
        school.setIsRemote(pojo.is_remote());
        school.setActivities(pojo.activities());
        return school;
    }

    public List<SchoolPersonnel> getAllPersonnel() {
        return personnelRepository.findAll();
    }

    public List<SchoolPersonnel> getPersonnelByCounty(String county) {
        return personnelRepository.findSchoolPersonnelByCounty(county);
    }

    public List<SchoolPersonnel> getPersonnelBySchool(String school) {
        return personnelRepository.findSchoolPersonnelBySchoolName(school);
    }
}