class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int prev_2 = nums[0];
        int prev_1 = Math.max(nums[1],prev_2);
        int current = prev_1;

        for(int i = 2; i<nums.length; i++){
            current = Math.max(prev_1,prev_2+nums[i]);
            prev_2=prev_1;
            prev_1=current;
        }
        return current;
    }
}