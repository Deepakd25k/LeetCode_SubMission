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
    private List<List<Integer>> allValidPaths;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        allValidPaths = new ArrayList<>();
        traverse(root, sum, new ArrayList<>());
        return allValidPaths;
    }

    private void traverse(TreeNode node, int sum, List<Integer> sumPath) {
        if(node == null) return;

        sumPath.add(node.val);
        if(node.left == null && node.right == null && node.val == sum) {
            allValidPaths.add(new ArrayList<>(sumPath));
        }
        else {
            traverse(node.left, sum - node.val, sumPath);
            traverse(node.right, sum - node.val, sumPath);
        }

        sumPath.remove(sumPath.size()-1);
    } 
}