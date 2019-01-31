import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
        SimpleDateFormat current = new SimpleDateFormat("hh:mm:ssa");
        Date date = new Date();
        try {
           date = current.parse(s);
        } catch (Exception e){

        }
        SimpleDateFormat converted = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        String time = converted.format(date);
        return time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
