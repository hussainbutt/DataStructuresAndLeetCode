class Solution {
    public int search(int[] nums, int target) {
        
        return helper(0,nums.length-1,nums, target);

    }
    public static int helper(int low, int high, int[] nums, int target){
        int mid = low + (high-low)/2;
        if(low>high) return -1;
        if(nums[mid] == target)
            return mid;

        //handling if left subarray is sorted
        if(nums[low]<=nums[mid]){
            if(target>=nums[low] && target<=nums[mid]){
                return helper(low,mid-1,nums,target);
            }else{
                return helper(mid+1,high,nums,target);
            }
        }
        //handling if right subarray is sorted
        else if(nums[mid]<=nums[high]){
            if(target>=nums[mid+1] && target <= nums[high]){
                return helper(mid+1,high,nums,target);
            }
            else{
                return helper(low,mid-1,nums,target);
                
            }
        }else{
            return -1;
        }
    }
}