import java.io.*;
import java.util.*;

public class Solution {
    static int similarChar(String s,int a){
        int l = s.length();
        char c = s.charAt(a-1);
        int count = 0;
        for(int i=0;i<a-1;i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s = sc.next();
        sc.nextLine();
        int q = sc.nextInt();
        int[] m = new int[q];
        int p;
        for(int i=0;i<q;i++){
            m[i] = sc.nextInt();
            p = m[i];
            System.out.println(similarChar(s,p));
        }
    }
}
