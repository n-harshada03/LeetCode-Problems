import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        
                                     
        int n=maximumHeight.length;
        Arrays.sort(maximumHeight);
        long curr=maximumHeight[n-1];
        long sum=0;
        

        for(int i=n-1;i>=0;i--){
                curr=Math.min(curr,(long) maximumHeight[i]);

                if(curr<=0){
                    return -1;
                }

                sum+=curr; 
                curr--; 
            }
        

        return sum;
    }
}
