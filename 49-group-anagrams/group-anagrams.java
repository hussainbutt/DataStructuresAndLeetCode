class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<String>();
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(String x: strs){
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            hm.putIfAbsent(str,new ArrayList<String>());
            hm.get(str).add(x);
        }
        return new ArrayList<List<String>>(hm.values());
    }
}