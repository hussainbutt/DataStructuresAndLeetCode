class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        } 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); 
        for(int x: stones){
            pq.add(x);
        }
        while(pq.size()!=1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            pq.add(num1 - num2);
        }
        return pq.poll();

    }
}