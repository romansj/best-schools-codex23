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
    private Long _id;

    @JsonProperty("Pašvaldība")
    private String jurisdiction;

    @JsonProperty("Iestādes reģistrācijas Nr.")
    private String regNo;

    @JsonProperty("Iestādes nosaukums")
    @Column(name = "school_name")
    private String name;

    @JsonProperty("Iestādes veids")
    @Column(name = "school_kind")
    private String kind;

    @JsonProperty("Iestādes tips")
    @Column(name = "school_type")
    private String type;

    @JsonProperty("Pakļautība")
    private String subordinateTo;

    @JsonProperty("Faktiskais dibinātājs")
    private String founder;

    @JsonProperty("Adreses ATVK kods")
    private int addressCode;

    @JsonProperty("Izglītības programmas kods")
    private int programmeCode;

    @JsonProperty("Izglītības programmas nosaukums")
    private String programmeName;

    @JsonProperty("Izglītojamo skaits vecumā līdz 5 gadu vecumam")
    private int pupilsUnderFive;

    @JsonProperty("Izglītojamo skaits vecumā 5 gadi un vairāk")
    private int pupilsFiveAndOlder;

    @JsonProperty("Izglītojamo skaits pirmsskolā kopā")
    private int totalPupilsPirmsskola;

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
    private int totalOneToTwelve;

    @JsonProperty("Izglītojamo skaits kopā")
    private int totalPupils;

}

