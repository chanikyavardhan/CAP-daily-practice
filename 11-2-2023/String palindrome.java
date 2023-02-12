import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.toLowerCase();
        String str1 = "";
        for(int i=str2.length()-1;i>-1;i--){
            str1 = str1+str2.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
        
    }
}
