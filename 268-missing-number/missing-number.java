class Solution {
    public int missingNumber(int[] nums) {
      
        int arrXor = 0;
        for(int i=0; i<=nums.length; i++){
            arrXor ^= i;
        }
        for(int x: nums){
            arrXor ^= x;
        }
        return arrXor;
    }
}