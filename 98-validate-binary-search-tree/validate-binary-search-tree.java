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
    public boolean isValidBST(TreeNode root) {
        List<Integer> al = new ArrayList();
        dfs(al,root);
        for(int i=1; i<al.size(); i++){
            if(al.get(i-1)>=al.get(i)){
                return false;
            }
        }
        return true;
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