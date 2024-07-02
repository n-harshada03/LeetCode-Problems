class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;

        int left=0;
        int right=n-1;

        while(left < right){
            if(numbers[left]==target-numbers[right]){
                
                return new int[] {left+1,right+1};

            }
            else if(numbers[left] < target-numbers[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {-1,-1};

    }
}