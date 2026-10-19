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
    public int diameter = 0;
    private int findheight(TreeNode node)
    {
        if(node == null) return 0;
        int lefth = findheight(node.left);
        int righth = findheight(node.right);
        diameter = Math.max(diameter,lefth+righth);
        return 1 + Math.max(lefth,righth);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findheight(root);
        return diameter;
    }
}
