class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int s = 0, ans = 0;
        map.put(0, -1);

        for(int i=0;i<n;++i){
            if(nums[i]==1) s+=1;
            else s-=1;

            if(map.containsKey(s)){
                ans = Math.max(ans, i-map.get(s));
            }
            else{
                map.put(s, i);
            }
        }

        return ans;
    }
        
}