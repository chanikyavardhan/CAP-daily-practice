/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:list){
             map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = maxfrequency(map);
        List<Integer> res = new ArrayList<>();
        for(int j:map.keySet()){
            if(max == map.get(j)){
                res.add(j);
            }
        }
        int[] result = new int[res.size()];
        int i=0;
        for(int k:res){
            result[i++]=k;
        }
        return result;

    }
    public void inorder(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public int maxfrequency(HashMap<Integer,Integer> map){
        int maxFrequency=0;
         for(int x:map.keySet()){
            maxFrequency=Math.max(maxFrequency,map.get(x));
         }
         return maxFrequency; 
    }
}
