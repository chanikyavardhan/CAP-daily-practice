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
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper=Integer.MAX_VALUE;
		return createTree(preorder,upper,new int[] {0});
    }
    public TreeNode createTree(int [] preorder,int upper,int[] curr){
		if(curr[0]==preorder.length) return null;
		if(preorder[curr[0]]>upper) return null;
		TreeNode root=new TreeNode(preorder[curr[0]++]);
		root.left=createTree(preorder,root.val, curr);
		root.right=createTree(preorder, upper, curr);
		return root;
	}
}
