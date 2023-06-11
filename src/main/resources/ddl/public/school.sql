create table if not exists school
(
    id                     bigint default unique_rowid() not null
        primary key,
    activities             varchar(255),
    english_exam           varchar(255),
    is_remote              varchar(255),
    latvian_exam           varchar(255),
    location               varchar(255),
    math_exam              varchar(255),
    name                   varchar(255),
    profile_based_learning varchar(1),
    school_offer_meals     varchar(1),
    school_type            varchar(1),
    website                varchar(255)
);

alter table school
    owner to guru;

