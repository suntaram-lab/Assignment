package com.rabobank.runner;

import com.rabobank.service.ReportProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import static java.lang.System.exit;
import java.io.IOException;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.rabobank.*"})
public class MonthlyReportRunner implements CommandLineRunner {

    private final Logger Log = LoggerFactory.getLogger(getClass());

    @Autowired
    ReportProcessService reportProcessService;
    public static void main(String[] args) throws IOException {
        SpringApplication app = new SpringApplication(MonthlyReportRunner.class);
        app.run(args);
    }

    @Override
    public void run(final String... args) throws Exception {
        if (args.length == 0) {
            reportProcessService.processReport("E:\\csvfile\\records.xml", "E:\\file-reader-master");
        } else {
            Log.error("Need argument 1 as input full file path and argument 2 output full folder path", args.length);
        }

        exit(0);
    }
}
