class Solution {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        if (n==1) return x;
        if(n == -1) return 1/x;
        
        
        double val = myPow(x,n/2);
        if(n%2 == 0){
            return val * val;
        }
        else{
           if(n>0){
             return x*val*val;
           }
           else if(n<0){
             return 1/x*val*val;
           }
        }
        return 0;
    }
}