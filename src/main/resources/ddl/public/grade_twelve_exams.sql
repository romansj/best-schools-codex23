create table if not exists grade_twelve_exams
(
    id                           serial primary key,
    county_code                  int2,
    school_name                  varchar(100),
    exam_name                    varchar(100),
    average_score                double precision,
    count_takers                 int4,
    below_five_percent           int4,
    five_to_nine_percent         int4,
    ten_to_nineteen_percent      int4,
    twenty_to_twentynine_percent int4,
    thirty_to_thirty_nine        int4,
    fourty_to_fourty_nine        int4,
    fifty_to_fifty_nine          int4,
    sixty_to_sixty_nine          int4,
    seventy_to_seventy_nine      int4,
    eighty_to_eighty_nine        int4,
    ninety_to_hundred            int4,
    year                         int2
);

alter table grade_twelve_exams
    owner to guru;

