package io.bootify.my_app.schools.pupils.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Root {
    private String help;
    private boolean success;
    private Result result;
}