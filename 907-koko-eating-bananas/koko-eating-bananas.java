class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        
        for(int p:piles){
            high=Math.max(p,high);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(piles,h,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;

    }

    public boolean isValid(int[] piles,int h,int mid){
        int totalHrs=0;
        for(int p:piles){
            // totalHrs += p/mid;
            // if(p % mid != 0) {
            //     totalHrs++;
            // }
            totalHrs+=Math.ceil((double)p/(double)mid);
        }
        return totalHrs<= h;
    }
}