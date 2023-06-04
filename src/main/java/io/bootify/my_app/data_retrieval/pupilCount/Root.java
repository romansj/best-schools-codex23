package io.bootify.my_app.data_retrieval.pupilCount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Root{
    private String help;
    private boolean success;
    private Result result;
}