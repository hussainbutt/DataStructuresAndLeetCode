class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] count = new int[26];
        if (strs.length == 0) {
            return new ArrayList();
        }

        HashMap<String, List<String>> hm1 = new HashMap();
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("hehe");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!hm1.containsKey(key))
                hm1.put(key, new ArrayList());
            hm1.get(key).add(s);

        }

        return new ArrayList(hm1.values());
    }
}