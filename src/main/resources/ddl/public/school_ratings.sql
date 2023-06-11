create table if not exists school_ratings
(
    id          bigint default unique_rowid() not null primary key,
    place       int4,
    rating      numeric(5, 2),
    school_name varchar(100),
    school_type varchar(30)
);

alter table school_ratings
    owner to guru;

