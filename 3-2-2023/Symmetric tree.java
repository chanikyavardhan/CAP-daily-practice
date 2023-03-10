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
    public boolean isSymmetric(TreeNode root) {
        return root==null || checksymmetric(root.left,root.right);
    }
    public boolean checksymmetric(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        return left.val==right.val &&checksymmetric(left.left,right.right)&& checksymmetric(left.right,right.left);
    }
}
