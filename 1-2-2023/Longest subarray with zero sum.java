import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		 HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
 
        int sum = 0; 
        int max_len = 0;
 
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
 
            if (sum == 0)
                max_len = i + 1;
            Integer prev_i = hM.get(sum);
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else 
                hM.put(sum, i);
        }
 
        return max_len;
	}
}
