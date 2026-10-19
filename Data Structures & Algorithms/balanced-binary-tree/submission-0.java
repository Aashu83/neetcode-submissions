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
    private int height(TreeNode node)
    {
        if(node == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);
        int level = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode x = q.poll();
                if(x.left != null) q.offer(x.left);
                if(x.right != null) q.offer(x.right);
            }
            level ++;
        }
        return level;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lefth = height(root.left);
        int righth = height(root.right);
        int diff = Math.abs(lefth - righth);
        if(diff > 1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));

    }
}
