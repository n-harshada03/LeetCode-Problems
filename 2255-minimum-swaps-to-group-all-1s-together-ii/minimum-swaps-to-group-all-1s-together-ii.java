class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int count_ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count_ones++;
            }

        }
        if(count_ones<=1)return 0;

        int[] extended = new int[2 * n];

        for (int i = 0; i < n; i++) {
        extended[i] = nums[i];    
        extended[i + n] = nums[i];
        }

        int min_zeros=Integer.MAX_VALUE;
        int curr_zeros=0;


        for(int i=0;i<count_ones;i++){
            if(extended[i]==0){
                curr_zeros++;
            }
        }

        min_zeros=curr_zeros;

        for(int i=count_ones;i<n+count_ones;i++){
            if(extended[i-count_ones]==0){
                curr_zeros--;
            }
            if(extended[i]==0){
                curr_zeros++;

            }

            min_zeros=Math.min(curr_zeros,min_zeros);
        }
        
        return min_zeros;
    }
}