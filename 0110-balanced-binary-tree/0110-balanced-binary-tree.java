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
    public int height(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int left_height = height(root.left);
        if(root.left != null) left_height++;
        int right_height = height(root.right);
        if(root.right != null) right_height++;
        int diff = left_height - right_height;
        if(diff < 0) diff = -diff; // make postive
        if(diff > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}