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
    public boolean isUnivalTree(TreeNode root) {
        
        boolean left_unival = root.left == null || root.left.val == root.val && isUnivalTree(root.left); 
        boolean right_unival = root.right == null || root.right.val == root.val && isUnivalTree(root.right); 
        
        return left_unival && right_unival;
    }
}