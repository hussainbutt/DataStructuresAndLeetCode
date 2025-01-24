class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        int majorityNumber = 0;
        for(int x: nums){
            hm1.put(x,(hm1.getOrDefault(x,0))+1);
        }
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry entry: hm1.entrySet()){
            if((int)entry.getValue()>maxValue){
                maxValue=(int)entry.getValue();
                majorityNumber= (int)entry.getKey();  
            }
        }
        return majorityNumber;
    }
}