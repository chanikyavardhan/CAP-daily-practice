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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode,Integer> map = new HashMap<>();
        queue.add(root);
        map.put(root,1);
        int currwidth = 0;
        int maxwidth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int start = 0;
            int end = 0;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(i==0){
                    start = map.get(curr);
                }
                if(i==size-1){
                    end = map.get(curr);
                }
                if(curr.left!=null){
                    map.put(curr.left,map.get(curr)*2);
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    map.put(curr.right,map.get(curr)*2+1);
                    queue.add(curr.right);
                }
            }
            currwidth = end-start+1;
            maxwidth = Math.max(currwidth,maxwidth);
        }
        return maxwidth;
    }
}
