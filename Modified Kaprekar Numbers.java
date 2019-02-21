import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {

        String all = "";
        long x = p;

        while(x <= q){

            long sqrt = x * x;
            long first = 0;
            long second = 0;

            if(x == 1){
                all = all + 1 + " ";
            } else {
                String s = String.valueOf(sqrt);
                int len = s.length() / 2;

                String[] parts = {s.substring(0, len), s.substring(len)};
                String part1 = parts[0];
                String part2 = parts[1];

                try {
                    first = Integer.parseInt(part1);
                    second = Integer.parseInt(part2);
                } catch(NumberFormatException ex) {

                } 

                if(first + second == x){
                    all = all + x + " ";
                }
            }
            
            x++;
        }

        if(all != null && !all.equals("")){
            System.out.println(all);
        } else {
            System.out.println("INVALID RANGE");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
