class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansArr=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int index=0;
        for(int num:nums){
            hm.put(num,index);
            index++;
        }

        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(hm.containsKey(val) && hm.get(val)!=i){
                ansArr[0]=i;
                ansArr[1]=hm.get(val);
            }
        }

        return ansArr;
        
        
    }
}