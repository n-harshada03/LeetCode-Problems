class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int n=arr.length;
        int mod=1000000007;
        int count=0;

        Map<Integer,Integer> freqMap=new HashMap<>();
        for (int i=0;i<n;i++){
            count=(count +  freqMap.getOrDefault(target-arr[i],0))% mod;

            for (int j=0;j<i;j++){
                int sum=arr[i]+arr[j];
                freqMap.put(sum,freqMap.getOrDefault(sum,0)+1);
            }
        }
        return count;


    }
}