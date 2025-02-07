class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();   
        for(int x: nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        System.out.println();
        int[] output = new int[k];
        for(int i= 0; i<k; i++){
        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue= entry.getValue();
                maxKey = entry.getKey();
            }
        }
        output[i] = maxKey;
        hm.remove(maxKey);
        }
         return output;
    }
}