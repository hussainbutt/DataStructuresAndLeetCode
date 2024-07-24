class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double maxAvg = -10000;
        int j = k - 1;
        while(j<nums.length){

            int sum = 0;
            int m = i;
            while (m<=j){
                sum += nums[m];
                m++;
                }
            double avg = (double)sum / (double)k;
          
            if(avg>maxAvg){
                maxAvg = avg;
            }

            i++;
            j++;
        }
        return maxAvg;
    }
}