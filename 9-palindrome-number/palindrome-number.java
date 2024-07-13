class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copy=x;
        int rev=0;

        while(copy>0){
            rev=rev*10 + (copy%10);
            copy=copy/10;
                       
        }
        return rev==x;
        
    }
}