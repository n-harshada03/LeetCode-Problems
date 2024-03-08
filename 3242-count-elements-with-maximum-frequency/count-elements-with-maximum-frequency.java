class Solution {
    public int maxFrequencyElements(int[] nums) {
    int ans = 0;
    int[] count = new int[101];
    int maxFreq = 0;

    for (int num : nums) {
        count[num]++;
    }

    for (int freq : count) {
        maxFreq = Math.max(maxFreq, freq);
    }

    for (int i = 0; i < nums.length; i++) {
        if (maxFreq == count[nums[i]]) {
            ans++;
        }
    }
    return ans;
    }

}