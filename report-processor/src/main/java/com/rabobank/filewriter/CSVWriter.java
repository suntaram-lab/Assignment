package com.rabobank.filewriter;

import com.rabobank.pojo.MonthlyReport;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter implements FileWriterInterface{
    @Override
    public void writeToFile(final List<MonthlyReport> records, final String path) {

        final Logger Log = LoggerFactory.getLogger(getClass());

        try (
                FileWriter fileWriter = new FileWriter(path);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Reference", "Description","Reason"));
        ) {
            for (MonthlyReport monthlyReport:records) {
                csvPrinter.printRecord(monthlyReport.getReference(), monthlyReport.getDescription(),monthlyReport.getReason());
            }
            csvPrinter.flush();
        } catch (IOException e) {
            Log.error("No files are present in given path",e.getMessage());
        }
    }
    }

