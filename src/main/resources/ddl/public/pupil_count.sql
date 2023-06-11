drop table if exists public.pupil_count;


create table if not exists public.pupil_count
(
    id                      serial primary key,
    jurisdiction            varchar(100),
    reg_no                  varchar(10),
    school_name             varchar(100),
    school_kind             varchar(100),
    school_type             varchar(100),
    subordinate_to          varchar(100),
    founder                 varchar(100),
    address_code            int4 not null,
    programme_code          int4 not null,
    programme_name          varchar(255),
    pupils_under_five       int4 not null,
    pupils_five_and_older   int4 not null,
    total_pupils_pirmsskola int4 not null,
    onek                    int4 not null,
    twok                    int4 not null,
    threek                  int4 not null,
    fourk                   int4 not null,
    fivek                   int4 not null,
    sixk                    int4 not null,
    sevenk                  int4 not null,
    eightk                  int4 not null,
    ninek                   int4 not null,
    tenk                    int4 not null,
    elevenk                 int4 not null,
    twelvek                 int4 not null,
    total_one_to_twelve     int4 not null,
    total_pupils            int4 not null
);

alter table public.pupil_count
    owner to guru;