class Solution {
    HashMap<Integer,Integer> hm1 = new HashMap();
    public int climbStairs(int n) {
        if(hm1.containsKey(n)) return hm1.get(n);
        if(n==2) return 2;
        if(n==1) return 1;

        int ans = climbStairs(n-1)+climbStairs(n-2);
        hm1.put(n,ans);
        return ans; 
    }
}