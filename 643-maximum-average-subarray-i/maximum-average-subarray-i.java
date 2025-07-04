class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Double.MIN_VALUE;
        for(int i = 0; i<k; i++){
            sum+=nums[i];
        }
        max = sum;
        int left = 0;
        int right = k-1;
        while(right<nums.length-1){
            sum -= nums[left];
            left++;
            right++;
            sum+=nums[right];
            if(max<sum){
                max = sum;
            }
        }
        return max/k;
    }
}