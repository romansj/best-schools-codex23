package io.bootify.my_app.schools;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;

import java.io.File;
import java.util.List;

public class SchoolReader {

    public static List<SchoolPojo> readFile(File csvFile) throws Exception {
        MappingIterator<SchoolPojo> personIter = new CsvMapper().readerWithTypedSchemaFor(SchoolPojo.class).readValues(csvFile);

        return personIter.readAll();
    }
}