class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        int count=0;

        int powOf2[] =new int[n];
        powOf2[0]=1;
        for(int k=1;k<n;k++){
            powOf2[k]=(powOf2[k-1] *2) % 1000000007;
        }

        while(i<= j){
            int sum=nums[i]+nums[j];
            if(sum <=target){
                count=(count+powOf2[j-i]) % 1000000007;
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}