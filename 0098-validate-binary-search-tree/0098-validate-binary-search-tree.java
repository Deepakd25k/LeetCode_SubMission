/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidSubtree(root, null, null);
    }
    boolean isValidSubtree (TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) ||  (max != null && root.val >= max)) return false;
        return isValidSubtree (root.left, min, root.val) && isValidSubtree(root.right, root.val, max);
    }
}