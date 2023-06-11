drop table if exists grade_nine_exams;

create table if not exists grade_nine_exams
(
    id          serial primary key,
    taker_count int4,
    school_name varchar(100),
    test_name   varchar(100),
    total_score double precision,
    year        int2
);

alter table grade_nine_exams
    owner to guru;

