import java.io.*;
import java.util.*;

public class Solution {
    public void noofIslands(int[][] arr,int i,int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==0){
            return;
        }
        arr[i][j]=0;
        noofIslands(arr,i-1,j);
        noofIslands(arr,i,j-1);
        noofIslands(arr,i+1,j);
        noofIslands(arr,i,j+1);
        noofIslands(arr,i-1,j-1);
        noofIslands(arr,i+1,j+1);
        noofIslands(arr,i-1,j+1);
        noofIslands(arr,i+1,j-1);
        return;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int count = 0;
        Solution island = new Solution();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                    island.noofIslands(arr,i,j);
                }
            }
        }
        System.out.print(count);
    }
}
