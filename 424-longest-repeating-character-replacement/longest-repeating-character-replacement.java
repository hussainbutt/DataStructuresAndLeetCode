class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxFrequency = 0;
        int[] freq = new int[26];
        int max = 0;
        Arrays.fill(freq,0);
        while(right<s.length()){
            //expand
            //add frequency
            freq[(int)s.charAt(right)-65]++;
            if(freq[(int)s.charAt(right)-65]>maxFrequency){
                maxFrequency = freq[(int)s.charAt(right)-65];
            }
            int windowSize = (right - left + 1);
            int change_required = windowSize - maxFrequency;
            if(change_required <= k && windowSize > max)
                {
                    max = windowSize;
                }
            //reduce
            if (change_required > k && left<right){
                freq[(int)s.charAt(left)-65]--;
                maxFrequency = findMax(freq);

                left++;
            }
            right++;
        }
         
           
        return max;
    }
    public static int findMax(int[] freq){
        int max = 0;
        for(int x: freq){
            if (x>max)
                max=x;
        }
        return max;
    }
}