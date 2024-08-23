class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)return -1;

        int maxEle=nums[0];
        int sum=0;
        for(int i:nums){
            if(i>maxEle){
                maxEle=i;
            }
            sum+=i;
        }

        int low=maxEle;
        int high=sum;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            int count=calCount(nums,mid);
            if(count <=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static int calCount(int[] nums,int mid){
        int cnt=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else {
                cnt++;
                sum=nums[i];
            }
        }
        return cnt;

    }
}