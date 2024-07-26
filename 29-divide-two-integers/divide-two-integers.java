class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (dividend == 0) {
            return 0;
        }

        long dIVIdend=Math.abs((long)dividend);
        long dIVIsor=Math.abs((long)divisor);
        long start=0;
        long end=dIVIdend;
        long ans=0;

        while(start<=end){
            long mid=start+(end-start)/2;
            long val=dIVIsor*mid;
            if(val==dIVIdend){
                ans= mid;
                break;

            }
            else if(val>dIVIdend){
                end=mid-1;
            }
            else if(val<dIVIdend){
                start=mid+1;
                ans=mid;
            }
        }

        if(dividend>0 && divisor>0 || dividend<0 && divisor<0){
            return (int)ans;
        }
        else{
            return (int)-ans;
        }

    }
}