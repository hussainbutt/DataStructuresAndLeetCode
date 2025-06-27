class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            int right = nums.length - 1;
            int left = i+1;
            while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum==0){
                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(nums[i]);
                        tempList.add(nums[left]);
                        tempList.add(nums[right]);

                        
                            hs.add(tempList);
                            left++;
                           right--;
                        }
                    else if(sum>0){
                        right--;
                    }else{
                        left++;
                    }
            }            
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>(hs);
        
        return ans;
    }
}
