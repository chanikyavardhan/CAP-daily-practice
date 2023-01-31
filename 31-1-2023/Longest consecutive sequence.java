class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int longestsequence = 0;
        for(int j:nums){
            int length = 1;
            int prev = j-1;
            while(set.contains(prev)){
                set.remove(prev);
                prev--;
                length++;
            }
            int next = j+1;
            while(set.contains(next)){
                set.remove(next);
                next++;
                length++;
            }
            longestsequence = Math.max(longestsequence,length);
        }
        return longestsequence;
    }
}
