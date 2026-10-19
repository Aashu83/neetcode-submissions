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
    private int height(TreeNode root)
    {
        int maxheight = 0;
        if(root == null) return 0;
        Stack<Pair<TreeNode,Integer>> st = new Stack<>();
        st.push(new Pair<>(root,1));
        while(!st.isEmpty())
        {
            Pair<TreeNode,Integer> p = st.pop();
            TreeNode node = p.getKey();
            Integer depth = p.getValue();
            if(node != null)
            {
               maxheight = Math.max(maxheight,depth);
               st.push(new Pair<>(node.left,depth+1));
               st.push(new Pair<>(node.right,depth+1));
            }
        }
        return maxheight;
    }
    public boolean isBalanced(TreeNode root) {
       if(root == null) return true;
       int lefth = height(root.left);
       int righth = height(root.right);
       int diff = Math.abs(lefth - righth);
       if(diff > 1) return false;
       return(isBalanced(root.left) && isBalanced(root.right));
    }
}
