import java.io.*;
import java.util.*;

class Index{
    int row;
    int col;
    public Index(int row,int col){
        this.row = row;
        this.col = col;
    }
}

public class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Index> q = new LinkedList<>();
        int freshcount =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Index(i,j));
                }
                else if(grid[i][j]==1){
                    freshcount++;
                }
            }
        }
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
        int count = 0;
        while(!q.isEmpty()&&freshcount>0){
            count++;
            int size = q.size();
            while(size-- >0){
                Index temp = q.poll();
                for(int[] d:direction){
                    int row = temp.row+d[0];
                    int col = temp.col+d[1];
                    if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0||grid[row][col]==2){
                        continue;
                    }
                    q.add(new Index(row,col));
                    grid[row][col]=2;
                    freshcount--;
                }
            }
        }
        if(freshcount==0){
            return count;
        }
        return -1;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution rotten = new Solution();
        int time = rotten.orangesRotting(arr);
        System.out.print(time);
        
        
    }
}
