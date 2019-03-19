import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        String date = "";
        boolean isLeap = false; 

        if(year == 1918){
            date = "26.09." + year;
        } else {
            if(year > 1918){
                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            isLeap = true;
                        } else {
                            isLeap = false;
                        }
                    } else {
                        isLeap = true;
                    }
                } else {
                    isLeap = false;
                }
            } else {
                if(year % 4 == 0){
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            }
            
            if(isLeap){
                date = "12.09." + year;
            } else {
                date = "13.09." + year;
            }
        
        }

        return date;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
