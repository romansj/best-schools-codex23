package io.bootify.my_app.data_retrieval;

import io.bootify.my_app.schools.SchoolService;
import io.bootify.my_app.schools.pupils.models.Root;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static java.lang.String.format;


@RestController
@RequestMapping("/api/v1/data")

public class DataController {

    public static final String SOURCE_DATA_GOV_LV = "https://data.gov.lv/dati/";


    // https://data.gov.lv/dati/lv/dataset/2017-20-g-augstakas-izglitibas-iestazu-absolventi-2020_21_monit-gada
    public static final String EMPLOYMENT_AFTER_GRADUATION = "dataset/db8029f4-f85f-4f75-8fd7-c2b73e3a7c58/resource/318f3c07-b440-46da-aac5-dfbcd69593bf/download/2017_2020_absolventi_20202021_monitoringa_-gados.csv";


    // Pedagogu skaits pa iestādēm uz 20.02.2021
    // https://data.gov.lv/dati/lv/dataset/pedagogu-skaits-pa-amatiem-vispareja-un-profesionala-izglitiba/resource/1ed389b1-2390-476d-9a29-005a817f307b
    public static final String TEACHERS_BY_SCHOOL = "dataset/b4ee58f1-9a9f-4bfc-b945-1acf37ac88ae/resource/1ed389b1-2390-476d-9a29-005a817f307b/download/pedagogiskaispersonalspaizglitibasiestadem_uz_20022021.xlsx";


    // Izglītojamo skaits uz 01.12.2022.
    public static final String PUPIL_COUNT = "/eng/api/3/action/datastore_search?resource_id=f7ae4483-8f99-43a9-afd6-11367871cd34";

    private final SchoolService service;

    @Autowired
    public DataController(SchoolService schoolService) {
        this.service = schoolService;
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/employment_after_graduation")
    public String getEmploymentAfterGraduationCSV() {
        ResponseEntity<String> response = restTemplate.getForEntity(SOURCE_DATA_GOV_LV + EMPLOYMENT_AFTER_GRADUATION, String.class);
        return response.getBody();
    }

    @GetMapping("/teachers_by_school")
    public String getData() {
        ResponseEntity<String> response = restTemplate.getForEntity(SOURCE_DATA_GOV_LV + TEACHERS_BY_SCHOOL, String.class);
        return response.getBody();
    }

    @GetMapping("/pupil_count")
    @Operation(summary = "Update database", description = "Load data from Data.gov.LV, replace DB data. API data is paginated, set limit on how much you need and link is provided for next set of data")
    public ResponseEntity<?> getData(@RequestParam(defaultValue = "10") String limit) {
        String formatted = format(SOURCE_DATA_GOV_LV + PUPIL_COUNT + "&limit=%s", limit);

        var response = restTemplate.getForEntity(formatted, Root.class);
        var records = response.getBody().getResult().getRecords();
        service.addPupilCountData(records);

        return ResponseEntity.accepted().build();
    }
}
