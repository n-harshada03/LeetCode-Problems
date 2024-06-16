class Solution {
    public void reverseFn(int nums[], int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind = -1;

        for (int i = n - 2; i >=0; i--) {
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverseFn(nums,0,n-1);
            return;
        }

        for(int i=n-1 ;i> ind ;i--){
            if(nums[i]> nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        reverseFn(nums,ind+1,n-1);
        return;

    }
}