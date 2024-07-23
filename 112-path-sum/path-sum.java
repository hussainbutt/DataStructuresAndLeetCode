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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> al = new ArrayList();
        return dfs(root,targetSum,0);
    }
    boolean dfs(TreeNode n,int targetSum, int prevSum){
        
        if(n!=null){
            int sum = prevSum + n.val;
            System.out.println(sum);
            if(n.left == null && n.right == null && sum == targetSum){
                return true;
            }
             if(n.left!=null){
                if(dfs(n.left, targetSum, sum)){
                    return true;
                }
            }

           
            if(n.right!=null){
                if(dfs(n.right, targetSum, sum)){
                    return true;
                }
            }

            
        }
        return false;
    }
}