class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        for(int i = 0; i<s1.length(); i++){
            arr1[s1.charAt(i)-97]++;
        }
        int left = 0;
        int right = s1.length()-1;
        for(int i = 0; i<s1.length();i++){
            arr2[s2.charAt(i)-97]++;
        }
        if(Arrays.equals(arr1, arr2)){
            return true;
        }

        while(right<s2.length()-1){
            arr2[s2.charAt(left)-97]--;
            left++;
            right++;
            arr2[s2.charAt(right)-97]++;
            if(Arrays.equals(arr1, arr2)){
            return true;
            }
        }
        return false;
    }
}