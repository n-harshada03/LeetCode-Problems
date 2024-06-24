class Solution {
    
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        int min=(int) (nums.length/3) + 1; 

        for(int i=0;i<nums.length;i++){
            
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
            
            if(map.get(nums[i])==min){
                ans.add(nums[i]);
            }
            if(ans.size()==2){
                break;
            }

        }
        return ans;
        
        
    }
}