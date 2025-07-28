class Solution {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[]{Integer.MIN_VALUE};  // use Integer.MIN_VALUE to handle negative values
        helper(root, max);
        return max[0];
    }

    public int helper(TreeNode root, int[] max) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left, max), 0);   // discard negative paths
        int right = Math.max(helper(root.right, max), 0); // discard negative paths

        int throughRoot = root.val + left + right;

        max[0] = Math.max(max[0], throughRoot); // update the global maximum

        return root.val + Math.max(left, right); // return the max gain if continuing upward
    }
}
