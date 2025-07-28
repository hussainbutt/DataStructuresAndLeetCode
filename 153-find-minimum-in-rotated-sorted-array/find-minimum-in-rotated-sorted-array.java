class Solution {
    public int findMin(int[] nums) {
        int rotations = 0;
        int returnIndex = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                rotations = nums.length - i + 1;
                returnIndex = i;
                break;
            }
        }
        return nums[returnIndex];
    }
}