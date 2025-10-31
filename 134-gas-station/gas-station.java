class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalCost>totalGas)
            return -1;

        int startIndex = 0;
        int currentGas = 0;
        for(int i = 0; i < gas.length; i++){
            currentGas = currentGas + gas[i] - cost[i];
            if(currentGas < 0){
                startIndex = i + 1;
                currentGas = 0;
            }
        }

        if(currentGas >= 0)
            return startIndex;

        return -1;
    }
}