import java.io.*;
import java.util.*;

public class Solution {
    static int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2;
        int count = 1;
        if(n%2==0){
            System.out.print(fib(m-1));
        }
        if(n%2!=0){
            System.out.print(n);
        }
    }
}
