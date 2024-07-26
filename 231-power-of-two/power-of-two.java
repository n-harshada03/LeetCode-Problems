class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }

        if(n>0 && (n & (n-1) )==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}