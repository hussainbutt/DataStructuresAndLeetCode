class Solution {

    public int helperFunction(int[]cost,int i,HashMap<Integer,Integer> hm){
        if(hm.containsKey(i)) return hm.get(i);
        if(i>=cost.length) return 0;
        int costPath1 = helperFunction(cost,i+1,hm);
        int costPath2 = helperFunction(cost,i+2,hm);
        hm.put(i,Math.min(costPath1,costPath2) + cost[i]);
        return hm.get(i);
    }
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        return Math.min(helperFunction(cost, 0,hm),helperFunction(cost, 1,hm));
    }
}