create table if not exists school_personnel
(
    county                                                 varchar(100),
    reg_no                                                 varchar(10) not null primary key,
    school_name                                            varchar(100),
    school_kind                                            varchar(30),
    school_type                                            varchar(30),
    subordinate                                            varchar(30),
    address_code                                           int2,
    personnel_count                                        int2,
    workplace_count                                        int2,
    vocational_trainer                                     int2,
    deputy_director                                        int2,
    director_education                                     int2,
    conductor                                              int2,
    choreographer                                          int2,
    vocational_teacher                                     int2,
    boarding_teacher                                       int2,
    izglitibas_iestades_bibliotekars                       int2,
    izglitibas_iestades_bibliotekars_ceturta_un_tresa_kval int2,
    izglitibas_iestades_muzeju_pedagogs                    int2,
    izglitibas_metodikis                                   int2,
    izglitibas_psihologs                                   int2,
    koncertmeistars                                        int2,
    pagarinatas_dienas_grupas_skolotajs                    int2,
    direktora_vietnieks_izglitibas_joma                    int2,
    direktors_izglitibas_joma                              int2,
    pedagoga_paligs                                        int2,
    pedagogs_karjeras_konsultants                          int2,
    pirmsskolas_izglitibas_metodikis                       int2,
    pirmsskolas_izglitibas_muzikas_skolotajs               int2,
    pirmsskolas_izglitibas_skolotajs                       int2,
    pirmsskolas_izglitibas_sporta_skolotajs                int2,
    profesionalas_ievirzes_skolotajs                       int2,
    profesionalas_izglitibas_skolotajs                     int2,
    sakumizglitibas_skolotajs                              int2,
    skolas_direktora_vietnieks                             int2,
    skolas_direktors                                       int2,
    skolotajs_baleta_makslinieks                           int2,
    skolotajs_logopeds                                     int2,
    skolotajs_mentors                                      int2,
    socialais_pedagogs                                     int2,
    specialais_pedagogs                                    int2,
    specialas_izglitibas_skolotajs                         int2,
    sporta_organizators                                    int2,
    sporta_treneris                                        int2,
    sporta_treneris_2                                      int2,
    vaditaja_vietnieks_direktora_vietnieks_izglitibas_joma int2,
    vaditaja_vietnieks_izglitibas_joma                     int2,
    vaditajs_direktors_izglitibas_joma                     int2,
    vaditajs_izglitibas_joma                               int2,
    visparejas_pamatizglitibas_skolotajs                   int2,
    visparejas_videjas_izglitibas_skolotajs                int
);

alter table school_personnel
    owner to guru;

