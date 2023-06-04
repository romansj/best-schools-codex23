package io.bootify.my_app.data_retrieval;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;

public class SchoolReader {

    public static List<SchoolPojo> readFile(File csvFile) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        CsvSchema csvSchema = csvMapper.schema().withHeader();
        ObjectReader objectReader = csvMapper.readerFor(SchoolPojo.class).with(csvSchema);
        MappingIterator<SchoolPojo> personIter = objectReader.readValues(csvFile);

        return personIter.readAll();
    }
}