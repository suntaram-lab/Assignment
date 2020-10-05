import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.filereader.constants.FileConstants;
import com.filereader.model.Customer;
import com.filereader.records.CSVItemReader;
import com.filereader.records.CSVItemWriter;
import com.filereader.records.XMLItemReader;


public class CSVItemReaderTest {

    String fileoutputpath=FileConstants.CSV_OUTPUT_PATH;
    String fileinputpath=FileConstants.CSV_FILE_PATH;
    String xmlfileinputpath=FileConstants.XML_FILE_PATH;

    @Test
    public void readCSVDataTest() throws FileNotFoundException {

        List<Customer> failedrecordlist = new ArrayList< Customer >();
        //calling csv reader method to check read functionality
        failedrecordlist=CSVItemReader.readCSVData(fileinputpath);
        //calling csv writer method to check write functionality
        CSVItemWriter.writeCSVData(failedrecordlist, fileoutputpath+ "/failed-records.csv");

        for (Customer customers:failedrecordlist) {
            System.out.println(customers.getReference());
            System.out.println(customers.getDesc());
            System.out.println(customers.getReason());
        }

    }

    @Test
    public void xmlreadFileTest() {

        List<Customer> failedrecordlist = new ArrayList<Customer>();
        failedrecordlist=XMLItemReader.readFile(xmlfileinputpath);

        for (Customer customers:failedrecordlist) {
            System.out.println(customers.getReference());
            System.out.println(customers.getDesc());
            System.out.println(customers.getReason());
        }

    }


}