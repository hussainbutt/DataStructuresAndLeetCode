class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return n;
        }
        HashMap<Integer,Integer> trustsMap = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> trustedByMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < trust.length; i++) {
            trustsMap.put(trust[i][0], trustsMap.getOrDefault(trust[i][0], 0) + 1);
        }
        for (int i = 0; i < trust.length; i++) {
            trustedByMap.put(trust[i][1], trustedByMap.getOrDefault(trust[i][1], 0) + 1);
        }

        int key = getKeyByValue(trustedByMap,n-1);
        boolean isTrustSomeoneElse = trustsMap.containsKey(key);

        if (key != -1 && !isTrustSomeoneElse){
            return key;
        }
        return -1;
    }
    public static int getKeyByValue(Map<Integer, Integer> map, Integer value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return -1;
}
}