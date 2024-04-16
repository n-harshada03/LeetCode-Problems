class Solution {
    public int majorityElement(int[] nums) {
        //voting algorithm
        int n=nums.length;
        int count=0;
        int max_ele= nums[0];

        for(int i=0;i<n;i++){
            if(max_ele==nums[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
            max_ele= nums[i];
            count=1;
            }
        }

        
        return max_ele;

    }
}