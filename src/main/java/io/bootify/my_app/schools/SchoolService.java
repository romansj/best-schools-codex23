package io.bootify.my_app.schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void addDisease(School disease) {
        schoolRepository.save(disease);
    }


}