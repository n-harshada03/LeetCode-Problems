class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        Integer[] newNums=new Integer[nums.length];

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0) +1);
            newNums[i]=nums[i];
                
        }
        Arrays.sort(newNums,(n1,n2)-> {
            if(hm.get(n1)!=hm.get(n2)){
                return hm.get(n1)- hm.get(n2);
            }
            else{
                return n2-n1;
            }
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=newNums[i];
        }

        return nums;
 
    }
}