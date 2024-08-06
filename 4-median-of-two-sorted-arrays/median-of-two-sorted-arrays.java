class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merge=new int[m+n];
        int i=0,j=0,k=0;

        while (i<n && j<m) {
            if (nums1[i]< nums2[j]) {
                merge[k++]= nums1[i++];
            } else {
                merge[k++]= nums2[j++];
            }
        }
        while (i < n) {
            merge[k++]=nums1[i++];
        }
        while (j < m) {
            merge[k++]= nums2[j++];
        }

        int len = merge.length;
        double mid=0;
        if (len % 2 == 0) {
            mid=(merge[len/2 - 1] + merge[len/2]) / 2.0;
        } else {
            mid=merge[len/2];
        }

        return mid;
    }
}