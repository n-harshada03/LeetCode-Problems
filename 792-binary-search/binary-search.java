class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length-1,target);
        
    }

    public static int helper(int nums[],int low,int high,int target){

        if(low>high) return -1;
        
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(target> nums[mid]){
            return helper(nums,mid+1,high,target);
        }
        else{
            return helper(nums,low,mid-1,target);
        }
    }
}