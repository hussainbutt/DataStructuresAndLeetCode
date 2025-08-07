class Solution {
    public int search(int[] nums, int target) {
       return helper(0, nums.length-1, target, nums);
        
    }
    public static int helper(int low, int high, int target, int[] nums){
        if(high<low) return -1;
        int mid = low + (high-low)/2;
        if(target == nums[mid]){
            return mid;
        }
        if(target<nums[mid]){
            return helper(low,mid-1, target, nums);
        }else{
            return helper(mid+1,high, target, nums);
        }
    }
}