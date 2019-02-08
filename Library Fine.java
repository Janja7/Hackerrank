import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	
    private static final int DAY_HACK = 15;
    private static final int MONTH_HACK = 500;
    private static final int YEAR_HACK = 10000;

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int result = 0;

        if (d1 <= d2 && m1 <= m2 && y1 <= y2) {
            result = 0;
        } else {
            if(y1 < y2){
                return result;
            }
            if(d1 > d2 && y1 >= y2 && m1 >= m2){
                result = DAY_HACK * (d1 - d2);
            }
            if(m1 > m2){
                result = MONTH_HACK * (m1 - m2);
            }
            if(y1 > y2){
                result = YEAR_HACK * (y1 - y2);
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
