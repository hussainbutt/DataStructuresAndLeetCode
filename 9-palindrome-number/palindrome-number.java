class Solution {
    public boolean isPalindrome(int n) {
        if(n < 0) return false;
        if (n != recursive(n,0))
            return false;
        else return true;
        
    }
    public int recursive(int n,int rev){
        if (n==0) return rev;
        return recursive(n/10, rev*10 + n%10);
        
    }
}