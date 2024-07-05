// class Solution {
//     public int helper(int arr[],int target,int n,int toSel,int arr1[][]){
    
//         if(n<0){
//             if(target==0){
//                 return 1;
//             }else return 0;
//         }
//         if(arr1[n][target]!=-1){
//             return arr1[n][target];

//         }
//         int include=0;
//         int exclude=0;

//         if(toSel<n+1){
//             System.out.println("hh ");
//             exclude=helper(arr,target,n-1,toSel,arr1);
            
//         }
//         if(toSel!=0){
            
//             if(arr[n]<=target){
//                 System.out.println("hr");
//             include=helper(arr,target-arr[n],n-1,toSel-1,arr1);
//             }
        
//         }
        

//         return arr1[n][target] = include+exclude;
        
//     }
//     public int threeSumMulti(int[] arr, int target) {
//         Arrays.sort(arr);
//         int n=arr.length;
        

//         int arr1[][]=new int[n+1][target+1];
//         for (int[] row : arr1) {
//             Arrays.fill(row, -1);
//         }
//         int count=helper(arr,target,n-1,3,arr1);
//         return count;
        
//     }
// }

import java.util.Arrays;

class Solution {
    private static final int MOD = 1000000007;

    public int helper(int arr[], int target, int n, int toSel, int arr1[][][]) {
        if (toSel == 0) {
            return target == 0 ? 1 : 0;
        }
        if (n < 0) {
            return 0;
        }
        if (arr1[n][target][toSel] != -1) {
            return arr1[n][target][toSel];
        }
        int include = 0;
        int exclude = 0;

        // Exclude current element
        exclude = helper(arr, target, n - 1, toSel, arr1);

        // Include current element if it does not exceed target
        if (arr[n] <= target) {
            include = helper(arr, target - arr[n], n - 1, toSel - 1, arr1);
        }

        return arr1[n][target][toSel] = (include + exclude) % MOD;
    }

    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        
        // DP table initialization with extra dimension for `toSel`
        int arr1[][][] = new int[n + 1][target + 1][4];
        for (int[][] row : arr1) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }
        }

        return helper(arr, target, n - 1, 3, arr1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1,1,2,2,3,3,4,4,5,5};
        int target1 = 8;
        System.out.println(solution.threeSumMulti(arr1, target1)); // Output: 20

        int[] arr2 = {1,1,2,2,2,2};
        int target2 = 5;
        System.out.println(solution.threeSumMulti(arr2, target2)); // Output: 12

        int[] arr3 = {2,1,3};
        int target3 = 6;
        System.out.println(solution.threeSumMulti(arr3, target3)); // Output: 1
    }
}
