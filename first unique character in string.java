class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        char [] arr = s.toCharArray();
        for(int j=0;j<arr.length;j++){
            if(map.get(s.charAt(j))==1){
                return s.indexOf(s.charAt(j));
            }
        }
        return -1;
    }
}
