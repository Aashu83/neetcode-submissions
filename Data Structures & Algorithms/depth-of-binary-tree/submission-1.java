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
    public int maxDepth(TreeNode root) {
        int res = 0;
        if(root == null) return res;
        Stack<Pair<TreeNode,Integer>> st = new Stack<>();
        st.push(new Pair<>(root,1));
        while(!st.isEmpty())
        {
            Pair<TreeNode,Integer> p = st.pop();
            TreeNode node = p.getKey();
            Integer depth = p.getValue();
            if(node != null)
            {
                res = Math.max(res,depth);
                st.push(new Pair<>(node.left,depth+1));
                st.push(new Pair<>(node.right,depth+1));
            }
        }
        return res;
    }
}
