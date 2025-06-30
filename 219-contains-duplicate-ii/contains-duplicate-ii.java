class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1)
            return false;
        HashSet<Integer> hs = new HashSet<Integer>();
        int i = 0;
        for(int x:nums){
            if(hs.contains(x)){
                return true;
            }
            hs.add(x);
            if(hs.size()>k){
                hs.remove(nums[Math.abs(i-k)]);
            }
            i++;
        }
        return false;
    }
}