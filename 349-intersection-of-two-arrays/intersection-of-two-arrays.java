class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    int i = 0, j = 0, k = 0;
    int[] temp = new int[Math.min(nums1.length, nums2.length)];
    
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            i++;
        } 
        else if (nums1[i] > nums2[j]) {
            j++;
        } 
        else {
            if (k == 0 || temp[k - 1] != nums1[i]) { // To avoid duplicate 
                temp[k++] = nums1[i];
            }
            i++;
            j++;
        }
    }
    
    int[] ans = Arrays.copyOf(temp, k);
    return ans;
}

}