class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int ans=0;
        if((long)m*k>n)return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low=Math.min(bloomDay[i],low);
            high=Math.max(bloomDay[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
        
    }

    public static boolean isPossible(int[] bloomDay,int m,int k,int mid){
        int n=bloomDay.length;
        int count=0;
        int NoofBoucket=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                NoofBoucket+=count/k;
                count=0;
            }
        }
        NoofBoucket+=count/k;
        return NoofBoucket>=m;
    }
}