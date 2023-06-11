package io.bootify.my_app.schools.personnel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "school_personnel")
public class SchoolPersonnel {
    @Id
    @Column(name = "reg_no", nullable = false, length = 10)
    private String regNo;

    @Column(name = "county", length = 100)
    private String county;

    @Column(name = "school_name", length = 100)
    private String schoolName;

    @Column(name = "school_kind", length = 30)
    private String schoolKind;

    @Column(name = "school_type", length = 30)
    private String schoolType;

    @Column(name = "subordinate", length = 30)
    private String subordinate;

    @Column(name = "address_code")
    private Short addressCode;

    @Column(name = "personnel_count")
    private Short personnelCount;

    @Column(name = "workplace_count")
    private Short workplaceCount;

    @Column(name = "vocational_trainer")
    private Short vocationalTrainer;

    @Column(name = "deputy_director")
    private Short deputyDirector;

    @Column(name = "director_education")
    private Short directorEducation;

    @Column(name = "conductor")
    private Short conductor;

    @Column(name = "choreographer")
    private Short choreographer;

    @Column(name = "vocational_teacher")
    private Short vocationalTeacher;

    @Column(name = "boarding_teacher")
    private Short boardingTeacher;

    @Column(name = "izglitibas_iestades_bibliotekars")
    private Short izglitibasIestadesBibliotekars;

    @Column(name = "izglitibas_iestades_bibliotekars_ceturta_un_tresa_kval")
    private Short izglitibasIestadesBibliotekarsCeturtaUnTresaKval;

    @Column(name = "izglitibas_iestades_muzeju_pedagogs")
    private Short izglitibasIestadesMuzejuPedagogs;

    @Column(name = "izglitibas_metodikis")
    private Short izglitibasMetodikis;

    @Column(name = "izglitibas_psihologs")
    private Short izglitibasPsihologs;

    @Column(name = "koncertmeistars")
    private Short koncertmeistars;

    @Column(name = "pagarinatas_dienas_grupas_skolotajs")
    private Short pagarinatasDienasGrupasSkolotajs;

    @Column(name = "direktora_vietnieks_izglitibas_joma")
    private Short direktoraVietnieksIzglitibasJoma;

    @Column(name = "direktors_izglitibas_joma")
    private Short direktorsIzglitibasJoma;

    @Column(name = "pedagoga_paligs")
    private Short pedagogaPaligs;

    @Column(name = "pedagogs_karjeras_konsultants")
    private Short pedagogsKarjerasKonsultants;

    @Column(name = "pirmsskolas_izglitibas_metodikis")
    private Short pirmsskolasIzglitibasMetodikis;

    @Column(name = "pirmsskolas_izglitibas_muzikas_skolotajs")
    private Short pirmsskolasIzglitibasMuzikasSkolotajs;

    @Column(name = "pirmsskolas_izglitibas_skolotajs")
    private Short pirmsskolasIzglitibasSkolotajs;

    @Column(name = "pirmsskolas_izglitibas_sporta_skolotajs")
    private Short pirmsskolasIzglitibasSportaSkolotajs;

    @Column(name = "profesionalas_ievirzes_skolotajs")
    private Short profesionalasIevirzesSkolotajs;

    @Column(name = "profesionalas_izglitibas_skolotajs")
    private Short profesionalasIzglitibasSkolotajs;

    @Column(name = "sakumizglitibas_skolotajs")
    private Short sakumizglitibasSkolotajs;

    @Column(name = "skolas_direktora_vietnieks")
    private Short skolasDirektoraVietnieks;

    @Column(name = "skolas_direktors")
    private Short skolasDirektors;

    @Column(name = "skolotajs_baleta_makslinieks")
    private Short skolotajsBaletaMakslinieks;

    @Column(name = "skolotajs_logopeds")
    private Short skolotajsLogopeds;

    @Column(name = "skolotajs_mentors")
    private Short skolotajsMentors;

    @Column(name = "socialais_pedagogs")
    private Short socialaisPedagogs;

    @Column(name = "specialais_pedagogs")
    private Short specialaisPedagogs;

    @Column(name = "specialas_izglitibas_skolotajs")
    private Short specialasIzglitibasSkolotajs;

    @Column(name = "sporta_organizators")
    private Short sportaOrganizators;

    @Column(name = "sporta_treneris")
    private Short sportaTreneris;

    @Column(name = "sporta_treneris_2")
    private Short sportaTreneris2;

    @Column(name = "vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma")
    private Short vaditajaVietnieksDirektoraVietnieksIzglitibasJoma;

    @Column(name = "vaditaja_vietnieks_izglitibas_joma")
    private Short vaditajaVietnieksIzglitibasJoma;

    @Column(name = "vaditajs_direktors_izglitibas_joma")
    private Short vaditajsDirektorsIzglitibasJoma;

    @Column(name = "vaditajs_izglitibas_joma")
    private Short vaditajsIzglitibasJoma;

    @Column(name = "visparejas_pamatizglitibas_skolotajs")
    private Short visparejasPamatizglitibasSkolotajs;

    @Column(name = "visparejas_videjas_izglitibas_skolotajs")
    private Long visparejasVidejasIzglitibasSkolotajs;

}