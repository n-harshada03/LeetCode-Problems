class Solution {
    public void sortColors(int[] nums) {
        helper(nums); 
    }
    public ArrayList<Integer> helper(int nums[]){
        int a=0, b=0, c=0;
        for(int num:nums){
            if(num==0){
                a++;
            }
            else if(num==1){
                b++;
            }
            else{
                c++;
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a;i++){
            arr.add(0);
        }
        for(int i=a;i<a+b;i++){
            arr.add(1);
        }
        for(int i=a+b;i<nums.length;i++){
            arr.add(2);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return arr;
    }
}