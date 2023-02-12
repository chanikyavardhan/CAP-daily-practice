class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] netTrust = new int[n+1];
        int judge = -1;
        for(int[] i:trust){
            netTrust[i[0]]--;
            netTrust[i[1]]++;
        }
        for(int j=0;j<=n;j++){
            if(netTrust[j]==n-1){
                judge = j;
            }
        }
        return judge;
    }
}
