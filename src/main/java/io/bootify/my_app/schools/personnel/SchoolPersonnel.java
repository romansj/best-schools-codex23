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
    private String regNo;
    @Column(name = "school_name", length = 255)
    private String schoolName;
    @Column(name = "school_kind", length = 50)
    private String schoolKind;
    @Column(name = "school_type", length = 50)
    private String schoolType;
    @Column(name = "subordinate", length = 50)
    private String subordinate;
    @Column(name = "address_code", length = 10)
    private String addressCode;
    @Column(name = "personnel_count", length = 10)
    private String personnelCount;
    @Column(name = "workplace_count", length = 10)
    private String workplaceCount;
    @Column(name = "vocational_trainer", length = 10)
    private String vocationalTrainer;
    @Column(name = "deputy_director", length = 10)
    private String deputyDirector;
    @Column(name = "director_education", length = 10)
    private String directorEducation;
    @Column(name = "conductor", length = 10)
    private String conductor;
    @Column(name = "choreographer", length = 10)
    private String choreographer;
    @Column(name = "vocational_teacher", length = 10)
    private String vocationalTeacher;
    @Column(name = "boarding_teacher", length = 10)
    private String boardingTeacher;
    @Column(name = "izglitibas_iestades_bibliotekars", length = 10)
    private String izglitibasIestadesBibliotekars;
    @Column(name = "izglitibas_iestades_bibliotekars_ceturta_un_tresa_kval", length = 10)
    private String izglitibasIestadesBibliotekarsCeturtaUnTresaKval;
    @Column(name = "izglitibas_iestades_muzeju_pedagogs", length = 10)
    private String izglitibasIestadesMuzejuPedagogs;
    @Column(name = "izglitibas_metodikis", length = 10)
    private String izglitibasMetodikis;
    @Column(name = "izglitibas_psihologs", length = 10)
    private String izglitibasPsihologs;
    @Column(name = "Koncertmeistars", length = 10)
    private String koncertmeistars;
    @Column(name = "pagarinatas_dienas_grupas_skolotajs", length = 10)
    private String pagarinatasDienasGrupasSkolotajs;
    @Column(name = "pamatdarbibas_strukturvienibas_vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma", length = 10)
    private String pamatdarbibasStrukturvienibasVaditajaVietnieksDirektoraVietnieksIzglitibasJoma;
    @Column(name = "pamatdarbibas_strukturvienibas_vaditajs_direktors_izglitibas_joma", length = 10)
    private String pamatdarbibasStrukturvienibasVaditajsDirektorsIzglitibasJoma;
    @Column(name = "pedagoga_paligs", length = 10)
    private String pedagogaPaligs;
    @Column(name = "pedagogs_karjeras_konsultants", length = 10)
    private String pedagogsKarjerasKonsultants;
    @Column(name = "pirmsskolas_izglitibas_metodikis", length = 10)
    private String pirmsskolasIzglitibasMetodikis;
    @Column(name = "pirmsskolas_izglitibas_muzikas_skolotajs", length = 10)
    private String pirmsskolasIzglitibasMuzikasSkolotajs;
    @Column(name = "pirmsskolas_izglitibas_skolotajs", length = 10)
    private String pirmsskolasIzglitibasSkolotajs;
    @Column(name = "pirmsskolas_izglitibas_sporta_skolotajs", length = 10)
    private String pirmsskolasIzglitibasSportaSkolotajs;
    @Column(name = "profesionalas_ievirzes_skolotajs", length = 10)
    private String profesionalasIevirzesSkolotajs;
    @Column(name = "profesionalas_izglitibas_skolotajs", length = 10)
    private String profesionalasIzglitibasSkolotajs;
    @Column(name = "sakumizglitibas_skolotajs", length = 10)
    private String sakumizglitibasSkolotajs;
    @Column(name = "skolas_direktora_vietnieks", length = 10)
    private String skolasDirektoraVietnieks;
    @Column(name = "skolas_direktors", length = 10)
    private String skolasDirektors;
    @Column(name = "skolotajs_baleta_makslinieks", length = 10)
    private String skolotajsBaletaMakslinieks;
    @Column(name = "skolotajs_logopeds", length = 10)
    private String skolotajsLogopeds;
    @Column(name = "skolotajs_mentors", length = 10)
    private String skolotajsMentors;
    @Column(name = "socialais_pedagogs", length = 10)
    private String socialaisPedagogs;
    @Column(name = "specialais_pedagogs", length = 10)
    private String specialaisPedagogs;
    @Column(name = "specialas_izglitibas_skolotajs", length = 10)
    private String specialasIzglitibasSkolotajs;
    @Column(name = "sporta_organizators", length = 10)
    private String sportaOrganizators;
    @Column(name = "sporta_treneris", length = 10)
    private String sportaTreneris;
    @Column(name = "sporta_treneris_2", length = 10)
    private String sportaTreneris2;
    @Column(name = "vaditaja_vietnieks_izglitibas_joma", length = 10)
    private String vaditajaVietnieksIzglitibasJoma;
    @Column(name = "vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma", length = 10)
    private String vaditajaVietnieksDirektoraVietnieksIzglitibasJoma;
    @Column(name = "vaditajs_izglitibas_joma", length = 10)
    private String vaditajsIzglitibasJoma;
    @Column(name = "vaditajs_direktors_izglitibas_joma", length = 10)
    private String vaditajsDirektorsIzglitibasJoma;
    @Column(name = "visparejas_pamatizglitibas_skolotajs", length = 10)
    private String visparejasPamatizglitibasSkolotajs;
    @Column(name = "visparejas_videjas_izglitibas_skolotajs", length = 10)
    private String visparejasVidejasIzglitibasSkolotajs;


}
