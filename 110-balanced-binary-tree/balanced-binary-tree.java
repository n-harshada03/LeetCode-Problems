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

    public int heightOfTree(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=heightOfTree(root.left);
        if(lh==-1) return -1;
        int rh=heightOfTree(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;

        return 1+ Integer.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        int height=heightOfTree(root);
        if(height != -1) return true;
        else return false;
        
    }
}