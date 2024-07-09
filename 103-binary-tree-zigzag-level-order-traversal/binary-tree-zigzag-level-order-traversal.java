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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        
        if(root==null){
            return list;
        }

        boolean leftToright=true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> subList=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode curr=queue.poll();
                subList.add(curr.val);

                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
                
            }

            if(leftToright==false){
                Collections.reverse(subList);
            }
            leftToright=!leftToright;
            list.add(subList);
        }

        return list;
        
    }
}