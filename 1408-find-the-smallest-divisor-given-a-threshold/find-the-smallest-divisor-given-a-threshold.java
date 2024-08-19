class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int ans=-1;

        for(int num:nums){
            high=Math.max(high,num);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(nums,mid,threshold)){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }

    public boolean isValid(int[] nums,int mid,int threshold){
        int total=0;

        for(int num:nums){
            total+=Math.ceil((double)num/(double)mid);
        }

        return total<=threshold;
    } 
}