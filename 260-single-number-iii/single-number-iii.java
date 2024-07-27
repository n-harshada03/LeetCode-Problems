class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(hm.get(num)==1){
                list.add(num);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}