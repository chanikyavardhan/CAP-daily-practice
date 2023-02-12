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

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
   public static String superReducedString(String s) {
        String res = removeDup(s);
        return res.equals("") ? "Empty String" : res;

    }
    
    public static String removeDup(String s) {
        boolean flag = false;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                s = s.substring(0,i) + s.substring(i + 2, s.length());
                flag = true;
            }
        }
        return flag ? removeDup(s) : s;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
