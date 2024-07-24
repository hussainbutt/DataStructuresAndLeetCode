class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int x: nums){
            sum += x;
        }
        System.out.print(sum);
        int sum2=0;
        for(int i = 0; i < nums.length; i++){
            sum-=nums[i];
             if(sum == sum2){
                return i;
            }
            System.out.println("------"+i+"-------");
            System.out.println(sum);
            System.out.println(sum2);
            sum2 += nums[i];
            
           
        }
        return -1;
    }
} 