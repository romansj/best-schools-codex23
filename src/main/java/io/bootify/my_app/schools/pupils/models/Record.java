package io.bootify.my_app.schools.pupils.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pupil_count")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int _id;
    @JsonProperty("Pašvaldība")
    private String jurisdiction;

    @JsonProperty("Iestādes reģistrācijas Nr.")
    private String regNo;

    @JsonProperty("Iestādes nosaukums")
    private String name;

    @JsonProperty("Iestādes veids")
    private String kind;
    @JsonProperty("Iestādes tips")
    private String type;
    @JsonProperty("Pakļautība")
    private String subordinate_to;
    @JsonProperty("Faktiskais dibinātājs")
    private String founder;
    @JsonProperty("Adreses ATVK kods")
    private int adress_code;
    @JsonProperty("Izglītības programmas kods")
    private int programme_code;
    @JsonProperty("Izglītības programmas nosaukums")
    private String programme_name;
    @JsonProperty("Izglītojamo skaits vecumā līdz 5 gadu vecumam")
    private int pupils_under_five;
    @JsonProperty("Izglītojamo skaits vecumā 5 gadi un vairāk")
    private int pupils_five_and_older;
    @JsonProperty("Izglītojamo skaits pirmsskolā kopā")
    private int total_pupils_pirmsskola;
    @JsonProperty("1. klase")
    private int oneK;
    @JsonProperty("2. klase")
    private int twoK;
    @JsonProperty("3. klase")
    private int threeK;
    @JsonProperty("4. klase")
    private int fourK;
    @JsonProperty("5. klase")
    private int fiveK;
    @JsonProperty("6. klase")
    private int sixK;
    @JsonProperty("7. klase")
    private int sevenK;
    @JsonProperty("8. klase")
    private int eightK;
    @JsonProperty("9. klase")
    private int nineK;
    @JsonProperty("10. klase")
    private int tenK;
    @JsonProperty("11. klase")
    private int elevenK;
    @JsonProperty("12. klase")
    private int twelveK;
    @JsonProperty("Kopā 1.-12.klasē")
    private int total_one_to_twelve;
    @JsonProperty("Izglītojamo skaits kopā")
    private int total_pupils;
}

