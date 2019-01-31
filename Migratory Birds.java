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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int type1 = 0;
        int type2 = 0;
        int type3 = 0;
        int type4 = 0;
        int type5 = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 1){
                type1 ++;
            }
            if(arr.get(i) == 2){
                type2 ++;
            }
            if(arr.get(i) == 3){
                type3 ++;
            }
            if(arr.get(i) == 4){
                type4 ++;
            }
            if(arr.get(i) == 5){
                type5 ++;
            }
        }

        map.put(1, type1);
        map.put(2, type2);
        map.put(3, type3);
        map.put(4, type4);
        map.put(5, type5);

        int typeMaxValue = Collections.max(map.values());
        int typeMax = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == typeMaxValue){
                typeMax = entry.getKey();
                break;
            }
        }
        
        return typeMax;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
