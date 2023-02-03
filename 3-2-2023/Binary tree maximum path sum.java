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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathsumfromsubtree(root);
        return maxsum;
    }
    public int pathsumfromsubtree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum = Math.max(pathsumfromsubtree(root.left),0);
        int rightsum = Math.max(pathsumfromsubtree(root.right),0);
        maxsum = Math.max(leftsum+rightsum+root.val,maxsum);
        return Math.max(leftsum,rightsum)+root.val;
    }
}
