class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
           
            return false;
        }
        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
        for(int i = 0; i<word1.length(); i++){
            hm1.put(word1.charAt(i),hm1.getOrDefault(word1.charAt(i),0)+1);
        }
        for(int i = 0; i<word2.length(); i++){
            hm2.put(word2.charAt(i),hm2.getOrDefault(word2.charAt(i),0)+1);
        }

        List<Integer> values1 = new ArrayList<>(hm1.values());
        List<Integer> values2 = new ArrayList<>(hm2.values());
        Collections.sort(values1);
        Collections.sort(values2);
        return values1.equals(values2) && hm1.keySet().equals(hm2.keySet());          
   
}}