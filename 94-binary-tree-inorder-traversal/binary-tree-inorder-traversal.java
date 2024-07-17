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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList();
        dfs(al,root);
        return al;
    }
    void dfs(List<Integer> result, TreeNode n){
        if(n!=null){
            if(n.left != null){
                dfs(result,n.left);
            }
            result.add(n.val);
            if(n.right!=null){
                dfs(result,n.right);
            }
        }
    }
}