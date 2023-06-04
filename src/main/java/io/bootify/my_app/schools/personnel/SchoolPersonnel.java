package io.bootify.my_app.schools.personnel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school_personnel")
public class SchoolPersonnel {

    @Column
    private String county;

    @Id
    @Column(name = "reg_no")
    private double regNo;
    @Column(name = "school_name")
    private String schoolName;
    @Column(name = "school_kind")
    private String schoolKind;
    @Column(name = "school_type")
    private String schoolType;
    @Column(name = "subordinate")
    private String subordinate;
    @Column(name = "address_code")
    private String addressCode;
    @Column(name = "personnel_count")
    private String personnelCount;
    @Column(name = "workplace_count")
    private String workplaceCount;
    @Column(name = "vocational_trainer")
    private String vocationalTrainer;
    @Column(name = "deputy_director")
    private String deputyDirector;
    @Column(name = "director_education")
    private String directorEducation;
    @Column(name = "conductor")
    private String conductor;
    @Column(name = "choreographer")
    private String choreographer;
    @Column(name = "vocational_teacher")
    private String vocationalTeacher;
    @Column(name = "boarding_teacher")
    private String boardingTeacher;
    @Column(name = "izglitibas_iestades_bibliotekars")
    private String izglitibasIestadesBibliotekars;
    @Column(name = "izglitibas_iestades_bibliotekars_ceturta_un_tresa_kval")
    private String izglitibasIestadesBibliotekarsCeturtaUnTresaKval;
    @Column(name = "izglitibas_iestades_muzeju_pedagogs")
    private String izglitibasIestadesMuzejuPedagogs;
    @Column(name = "izglitibas_metodikis")
    private String izglitibasMetodikis;
    @Column(name = "izglitibas_psihologs")
    private String izglitibasPsihologs;
    @Column(name = "Koncertmeistars")
    private String koncertmeistars;
    @Column(name = "pagarinatas_dienas_grupas_skolotajs")
    private String pagarinatasDienasGrupasSkolotajs;
    @Column(name = "pamatdarbibas_strukturvienibas_vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma")
    private String pamatdarbibasStrukturvienibasVaditajaVietnieksDirektoraVietnieksIzglitibasJoma;
    @Column(name = "pamatdarbibas_strukturvienibas_vaditajs_direktors_izglitibas_joma")
    private String pamatdarbibasStrukturvienibasVaditajsDirektorsIzglitibasJoma;
    @Column(name = "pedagoga_paligs")
    private String pedagogaPaligs;
    @Column(name = "pedagogs_karjeras_konsultants")
    private String pedagogsKarjerasKonsultants;
    @Column(name = "pirmsskolas_izglitibas_metodikis")
    private String pirmsskolasIzglitibasMetodikis;
    @Column(name = "pirmsskolas_izglitibas_muzikas_skolotajs")
    private String pirmsskolasIzglitibasMuzikasSkolotajs;
    @Column(name = "pirmsskolas_izglitibas_skolotajs")
    private String pirmsskolasIzglitibasSkolotajs;
    @Column(name = "pirmsskolas_izglitibas_sporta_skolotajs")
    private String pirmsskolasIzglitibasSportaSkolotajs;
    @Column(name = "profesionalas_ievirzes_skolotajs")
    private String profesionalasIevirzesSkolotajs;
    @Column(name = "profesionalas_izglitibas_skolotajs")
    private String profesionalasIzglitibasSkolotajs;
    @Column(name = "sakumizglitibas_skolotajs")
    private String sakumizglitibasSkolotajs;
    @Column(name = "skolas_direktora_vietnieks")
    private String skolasDirektoraVietnieks;
    @Column(name = "skolas_direktors")
    private String skolasDirektors;
    @Column(name = "skolotajs_baleta_makslinieks")
    private String skolotajsBaletaMakslinieks;
    @Column(name = "skolotajs_logopeds")
    private String skolotajsLogopeds;
    @Column(name = "skolotajs_mentors")
    private String skolotajsMentors;
    @Column(name = "socialais_pedagogs")
    private String socialaisPedagogs;
    @Column(name = "specialais_pedagogs")
    private String specialaisPedagogs;
    @Column(name = "specialas_izglitibas_skolotajs")
    private String specialasIzglitibasSkolotajs;
    @Column(name = "sporta_organizators")
    private String sportaOrganizators;
    @Column(name = "sporta_treneris")
    private String sportaTreneris;
    @Column(name = "sporta_treneris_2")
    private String sportaTreneris2;
    @Column(name = "vaditaja_vietnieks_izglitibas_joma")
    private String vaditajaVietnieksIzglitibasJoma;
    @Column(name = "vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma")
    private String vaditajaVietnieksDirektoraVietnieksIzglitibasJoma;
    @Column(name = "vaditajs_izglitibas_joma")
    private String vaditajsIzglitibasJoma;
    @Column(name = "vaditajs_direktors_izglitibas_joma")
    private String vaditajsDirektorsIzglitibasJoma;
    @Column(name = "visparejas_pamatizglitibas_skolotajs")
    private String visparejasPamatizglitibasSkolotajs;
    @Column(name = "visparejas_videjas_izglitibas_skolotajs")
    private String visparejasVidejasIzglitibasSkolotajs;


}
