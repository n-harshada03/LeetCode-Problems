class Solution {
    public int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[low]<=nums[mid]){ 
                if(nums[low]<=target && target<nums[mid]){
                    // return mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                
            }
            else{ 
                
                if(nums[mid]<target && target<=nums[high] ){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
                
        }
        return -1;
        
    }
}


    // int arr[]=new int[2*nums.length];
    // for(int i=0;i<nums.length;i++){
    //     arr[i]=nums[i];
    // }
    // for(int i=0;i<nums.length;i++){
    //     arr[i+nums.length]=nums[i];
    // }
    // int count=0;
    // for(int i=0;i<arr.length-1;i++){
    //     if(arr[i]<arr[i+1]){
    //         count++;
    //     }else{
    //         break;
    //     }
    // }
    // int low=0;
    // int high=arr.length-1;
    
    // while(low<=high){
    //     int mid=low+(high-low)/2;

    //     if(arr[mid]==target){
    //         return count+mid;
    //     }
    //     else if (arr[mid]<target){
    //         low=mid+1;
    //     }
    //     else{
    //         high=mid-1;
    //     }
//     }

//     return -1;
//     }
// }