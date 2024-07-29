class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return n;
        }
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();

        for (int j = 0; j < trust.length; j++) {
            hm1.put(trust[j][0], hm1.getOrDefault(trust[j][0], 0) + 1);
        }
        for (int i = 0; i < trust.length; i++) {
            hm2.put(trust[i][1], hm2.getOrDefault(trust[i][1], 0) + 1);
        }

        int key = getKeyByValue(hm2,n-1);
        boolean isZero = hm1.containsKey(key);
        System.out.println(key);
        System.out.println(isZero);
        if (key != -1 && !isZero){
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