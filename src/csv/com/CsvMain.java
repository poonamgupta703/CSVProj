package csv.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvMain {

public static void main(String[] args) throws FileNotFoundException, IOException {

InputStream stream1 = CsvMain.class.getResourceAsStream("/file1.csv");
        List<List<String>> file1List = new ArrayList<>();
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(stream1))) {
            String line1;
            while ((line1 = br1.readLine()) != null) {
                String[] values1 = line1.split(",");
                file1List.add(Arrays.asList(values1));
            }
        }
        
        InputStream stream2 = CsvMain.class.getResourceAsStream("/file2.csv");
        List<List<String>> file2List = new ArrayList<>();
        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(stream2))) {
            String line2;
            while ((line2 = br2.readLine()) != null) {
                String[] values2 = line2.split(",");
                file2List.add(Arrays.asList(values2));
            }
        }
        
        
        
        
        
        for(List<String> a : file2List) {
        for(String b : a) {
        System.out.println(b);
        }
        
        }
}

}