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
    public TreeNode invertTree(TreeNode root) {
        // if(root == null) return null;
        // TreeNode lf = root.left;
        // TreeNode rt = root.right;
        // root.left = rt;
        // root.right = lf;
        // //if(root.left == null && root.right == null) return root;
        // if(root.left == null) return null;
        // if(root.right == null) return null;
        // if(root.right != null) invertTree(root.left);
        // if(root.left != null) invertTree(root.right);
        // return root;
        // above code is written by me showing test cases has passed but hidden test cases has not passed

        // by teacher sol;
        if(root == null) return root;
        TreeNode l = root.left;
        TreeNode r = root.right;
        
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }
}