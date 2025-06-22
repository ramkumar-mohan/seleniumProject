package rkarraylist;

import java.io.FileReader;
import com.opencsv.CSVReader;

public class readcsvfile {
	public static void main(String[] args) {
	    try {
	        // Replace with the actual absolute path to your CSV file
	        String filePath = "D:\\Users\\Administrator\\Downloads\\websites.csv";
	        FileReader filereader = new FileReader(filePath);
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }
            System.out.println("Data read successfully.");
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
