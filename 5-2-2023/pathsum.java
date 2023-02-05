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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Stack<TreeNode> nodes = new Stack();
        Stack<Integer> sumstack = new Stack();
        nodes.add(root);
        sumstack.add(targetSum - root.val);
        while(!nodes.isEmpty()){
            TreeNode curr_node = nodes.pop();
            int curr_sum = sumstack.pop();

            if(curr_node.left==null && curr_node.right==null && curr_sum==0){
                return true;
            }
            if(curr_node.left!=null){
                nodes.add(curr_node.left);
                sumstack.add(curr_sum - curr_node.left.val);
            }
            if(curr_node.right!=null){
                nodes.add(curr_node.right);
                sumstack.add(curr_sum - curr_node.right.val);
            }
        }
        return false;
    }
}
