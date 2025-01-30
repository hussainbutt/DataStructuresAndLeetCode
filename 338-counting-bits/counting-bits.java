class Solution {
    public int[] countBits(int n) {
        int[] array = new int[n+1];
        Arrays.fill(array, 0);
       
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                array[i] = array[i-1] + 1;
            }
            else{
                array[i] = array[i>>1];
            }
        }
        return array;

    }
}