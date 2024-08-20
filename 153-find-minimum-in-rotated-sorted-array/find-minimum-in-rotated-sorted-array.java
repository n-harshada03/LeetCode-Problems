class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        // if(n==1)return nums[0];
        int low=0;
        int high=n-1; 
        int minEle=Integer.MAX_VALUE;


        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[low]<=nums[mid]){
                minEle=Math.min(nums[low],minEle);
                low=mid+1;
            }
            else{
                minEle=Math.min(nums[mid],minEle);
                high=mid-1;
            }
        }
        return minEle;
    }
}