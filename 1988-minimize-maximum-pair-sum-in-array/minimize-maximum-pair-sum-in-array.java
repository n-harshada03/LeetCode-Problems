class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=n-1;
        int MaxSum=0;


        while(left< n/2){

            int sum=nums[left] + nums[right];
            MaxSum=Math.max(MaxSum,sum);
            left++;
            right--;
        }
        return MaxSum;
        
    }
}