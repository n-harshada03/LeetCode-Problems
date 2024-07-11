class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        ArrayList<Double> list=new ArrayList<Double>();

        while(left<right){
            double avg=(double) (nums[left]+nums[right])/2;
            list.add(avg);
            left++;
            right--;
        }       
        Collections.sort(list);
        return list.get(0);
    }
}