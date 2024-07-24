class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0,j = 1; i<nums.length && j<nums.length;){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp; 
            }
            if (nums[i] != 0){
                i++;
            }
            j++;
        }
    }
}