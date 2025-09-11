class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = temperatures.length-1; i>=0; i--){
            System.out.println("in loop:" + i);
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty() && temperatures[st.peek()]>temperatures[i]){
                ans[i] = st.peek()-i;
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }

            st.push(i);
        }
        return ans;
    }
}