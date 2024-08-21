class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0,maxi=0;
        int ans=0;
        for(int i:weights){
            sum+=i;
        }
        for(int i:weights){
            maxi=Math.max(i,maxi);
        }
        int low=maxi;
        int high=sum;

        if(weights.length==days)return maxi;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] weights,int mid,int days){
        int sum=0,count=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                count++;
                sum=weights[i];
            }
           
        }
        count++;
        return count<=days;
    }
}