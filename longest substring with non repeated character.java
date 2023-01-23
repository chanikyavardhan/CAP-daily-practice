class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int maxlength=0;
        HashSet<Character> set = new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxlength = Math.max(set.size(),maxlength);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxlength;
    }
}
