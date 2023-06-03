package io.bootify.my_app.schools;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

public record SchoolPojo(
        @JsonIgnore
        String Id,
        @JsonAlias("school")
        String name,
        String website,
        String location,
        String lv_exam,
        String en_exam,
        String math_exam,
        String school_lunches,
        String activities,
        String profile_based_learning,
        String school_type,
        String is_remote) {
}
