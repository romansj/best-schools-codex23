package io.bootify.my_app.data_retrieval.pupilCount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Result{
    private boolean include_total;
    private String resource_id;
    private ArrayList<Field> fields;
    private String records_format;
    private ArrayList<Record> records;
    private int limit;
    private Links _links;
    private int total;
}


