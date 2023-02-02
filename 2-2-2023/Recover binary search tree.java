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
    ArrayList<Integer> a=new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
    inorder(root);
    Collections.sort(a);
    correct(root);
    }
    public void inorder(TreeNode root){
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    a.add(root.val);
    inorder(root.right);
}
public void correct(TreeNode root)
{
    if(root==null) return;
    if(root!=null)
    {
        correct(root.left);
        if(root.val!=a.get(i))
        {
            root.val=a.get(i);
        }
        i++;
        correct(root.right);
    }
}
}
