class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};  // use Integer.MIN_VALUE to handle negative values
        helper(root, max);
        return max[0];
    }

    public int helper(TreeNode root, int[] max) {
       if(root == null) return 0;
       int left = Math.max(0,helper(root.left,max)); //left subtree
       int right = Math.max(0,helper(root.right,max)); // right subtree

       int splitPathSum = left+right+root.val;
       if(splitPathSum > max[0]) max[0] = splitPathSum;
       return root.val+Math.max(left, right);
}
}
