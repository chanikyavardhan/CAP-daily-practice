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
        int prenode=0;
    public TreeNode build(int[] pr,int[] in, int a,int b){
        if(a>b){
            return null;
        }
        TreeNode root=new TreeNode(pr[prenode]);
        prenode++;
        int fun=0;
        for(int i=a;i<=b;i++){
            if(root.val==in[i]){
                fun=i;
                break;
            }
        }
        root.left=build( pr, in,a,fun-1);
        root.right=build(pr,in,fun+1,b);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return build(preorder,inorder,0,preorder.length-1);
    }
}
