class Solution {
    public int search(int[] nums, int target) {
        
        return helper(0,nums.length-1,nums, target);

    }
    public static int helper(int low, int high, int[] nums, int target){
        int mid = low + (high-low)/2;
        if(low>high) return -1;
        if(nums[mid] == target)
            return mid;
        if(nums[low]<=nums[mid]){
            if(target>=nums[low] && target<=nums[mid]){
                while(nums[mid] == nums[mid-1]) mid--;
                return helper(low,mid-1,nums,target);
            }else{
                return helper(mid+1,high,nums,target);
            }
        }
        else if(nums[mid]<=nums[high]){
            if(target>=nums[mid+1] && target <= nums[high]){
                while(nums[mid] == nums[mid+1]) mid = mid + 1;

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