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
    List<TreeNode> sortedArr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return sortedArrayToBST(0, sortedArr.size() - 1);
    }
   public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        sortedArr.add(root);
        inorder(root.right);
    }
    public TreeNode sortedArrayToBST(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode root = sortedArr.get(mid);
        root.left = sortedArrayToBST(left, mid - 1);
        root.right = sortedArrayToBST(mid + 1, right);
        return root;
    }
}
