package io.bootify.my_app.data_retrieval;

import io.bootify.my_app.schools.School;
import io.bootify.my_app.schools.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;


@RestController
@RequestMapping("/api/v1/data")

public class DataController {

    private final SchoolService service;

    @Autowired
    public DataController(SchoolService schoolService) {
        this.service = schoolService;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/list")
    public List<School> getAll() {
        return service.getAll();
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public String getData() {

        ResponseEntity<String> response = restTemplate.getForEntity("https://data.gov.lv/dati/eng/api/3/action/datastore_search?resource_id=f7ae4483-8f99-43a9-afd6-11367871cd34&limit=5", String.class);
        return response.getBody();
    }


}
