class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int x: nums){
            sum += x;
        }
        int sum2=0;
        for(int i = 0; i < nums.length; i++){
            sum-=nums[i];
             if(sum == sum2){
                return i;
            }
            
            sum2 += nums[i];
            
           
        }
        return -1;
    }
} 