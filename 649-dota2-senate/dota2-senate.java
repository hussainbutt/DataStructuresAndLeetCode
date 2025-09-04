class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        char[] arr = senate.toCharArray();
        Queue<Integer> r = new LinkedList<Integer>();
        Queue<Integer> d = new LinkedList<Integer>();
        for(int i = 0; i < senate.length(); i++){
            if(arr[i] == 'R')
                r.add(i);
            else
                d.add(i);
        }

        while(!r.isEmpty() && !d.isEmpty()){
            int rThis = r.poll();
            int dThis = d.poll();
            if(rThis<dThis)
                r.add(n+rThis);
            else
                d.add(n+dThis);

        }
        return r.isEmpty() ? "Dire" : "Radiant";

        

    }
}