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
    int maxSum=Integer.MIN_VALUE;
    int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        int lSum=dfs(root.left);
        int rSum=dfs(root.right);

        lSum=Math.max(0,lSum);
        rSum=Math.max(0,rSum);

        maxSum=Math.max(maxSum,root.val+lSum+rSum);

        return root.val+ Math.max(lSum,rSum);

    }

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
        
        
    }
}