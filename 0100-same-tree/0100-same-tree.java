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
    // preorder of p tree
    // public int preorder(TreeNode p){
    //     if(p == null) return 0;
    //     return p.val;
    //     preorder(p.left);
    //     preorder(p.right);
    // }
    // public int preorder(TreeNode q){
    //     if(q == null){
    //         return q.val;
    //         preorder(q.left);
    //         preorder(q.right);
    //     }
    // }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}