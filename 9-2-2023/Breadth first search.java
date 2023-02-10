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
     * Complete the 'bfs' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. 2D_INTEGER_ARRAY edges
     *  4. INTEGER s
     */

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
    // Write your code here
        Map<Integer,Integer> edgeMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int[] distance = new int[n];
        for(int i = 0 ; i<n && i!=s-1;i++){
            distance[i] = Integer.MAX_VALUE;
            
        }
        
        boolean[] visited = new boolean[n];
        visited[s-1]=true;
        int[][] edgesMatrix = new int[n][n];
        for(int i = 0;i<edges.size();i++){
            edgesMatrix[edges.get(i).get(0)-1][edges.get(i).get(1)-1]=1;
             edgesMatrix[edges.get(i).get(1)-1][edges.get(i).get(0)-1]=1;
        }
        
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(s-1);
         
        while(!(q.isEmpty())){
            int current= q.poll();
            
            for(int i = 0 ;i<edgesMatrix.length;i++){
                if(edgesMatrix[current][i]==1&& !visited[i]){
                    visited[i] = true;
                    q.add(i);
                    distance[i]=distance[current]+6;
                    
                    
                }
                
            }
            
            
        }
        //System.out.println(Arrays.toString(distance));
        for(int i = 0 ;i<distance.length;i++){
            if(i!=s-1&&distance[i]!=0){
                res.add(distance[i]= distance[i]==Integer.MAX_VALUE ?-1 : distance[i]);
                
            }
            if(i!=s-1&&distance[i]==0){
                distance[i]=-1;
                res.add(distance[i]);
            }
        }
        return res;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                List<List<Integer>> edges = new ArrayList<>();

                IntStream.range(0, m).forEach(i -> {
                    try {
                        edges.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int s = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> result = Result.bfs(n, m, edges, s);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
