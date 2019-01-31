import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int num = arr.length;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive += 1;
            } else if (arr[i] < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }

        double resultPos = (double)positive / num;
        double resultNeg = (double)negative / num;
        double resultZero = (double)zero / num;

        System.out.println(resultPos);
        System.out.println(resultNeg);
        System.out.println(resultZero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
