class Solution {
    public int combinationSum4(int[] nums, int target) {
    
        int t[]=new int [target+1];
        t[0]=1;

        
        for(int i=1;i<=target;i++){
            for(int num: nums){
                if(i-num>=0){
                    t[i]=t[i] + t[i-num];
                }
            }
        }

        return t[target];
        
    }
}