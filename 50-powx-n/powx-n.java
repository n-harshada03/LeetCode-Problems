class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        double n_temp = n;
        
        if(n==0){
            return 1;
        }

        if(n<0){
            n_temp=n_temp*-1;
            x=1/x;
        }
        
        if(n_temp %2==0){
            
            return myPow(x*x,(int) n_temp/2);
           
        }
        else{
            return x * myPow(x,(int) n_temp-1);
        }
        
    }
}