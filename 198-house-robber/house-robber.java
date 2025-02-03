class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] maxLoot = new int[nums.length];
        maxLoot[0] = nums[0];
        maxLoot[1] = Math.max(nums[1],maxLoot[0]);

        for(int i = 2; i<nums.length; i++){
            maxLoot[i] = Math.max(maxLoot[i-1],maxLoot[i-2]+nums[i]);
        }
        return maxLoot[maxLoot.length-1];
    }
}