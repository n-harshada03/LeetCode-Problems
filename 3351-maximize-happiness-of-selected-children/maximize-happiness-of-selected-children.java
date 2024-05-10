class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        long sum =0;
        for (int i = 0; i < k; i++) {
            if (happiness[n -1-i] -i>0) {
                sum += happiness[n - 1-i]-i;

            } else {
                sum += 0;
            }

            // if(happiness[n-i-2]>0){
            //     happiness[n-i-2] = happiness[n-i-2] - 1;
            //     break;
            // }
            
         
        }

        return sum;

    }
}