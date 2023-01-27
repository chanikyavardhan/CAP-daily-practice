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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
           // TreeNode curr = queue.poll();
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                list1.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            list.add(list1);
        }
        for(int j=0;j<list.size();j++){
            if(j%2==1) Collections.reverse(list.get(j));
        }
        return list;
    }
}
