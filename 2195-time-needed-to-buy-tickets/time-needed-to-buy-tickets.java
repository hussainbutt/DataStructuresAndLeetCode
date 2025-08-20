class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int output = 0;
        while(tickets[k] != 0){
            for(int i = 0; i<tickets.length; i++){
                if(tickets[i] == 0){
                    continue;
                }

                tickets[i]--;
                output++;
                if(i==k){
                    if(tickets[k] == 0){
                        return output;
                    }
                }
            }
        }
        return output;

    }
}