class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pairs[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            pairs[i][0]=nums[i];
            pairs[i][1]=i;
        }
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[0],b[0]));

        int i=0;
        int j=nums.length-1;
        
        
        while(i<j){
            int sum=pairs[i][0]+pairs[j][0];
            if(sum==target){
                // pairs[i][1]=i;
                // pairs[j][1]=j;
                return new int[] { pairs[i][1], pairs[j][1] };
            }  
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
            
        }   
        // ans[0]=-1;
        // ans[1]=-1;
        return new int[] { -1, -1 };
    }
}