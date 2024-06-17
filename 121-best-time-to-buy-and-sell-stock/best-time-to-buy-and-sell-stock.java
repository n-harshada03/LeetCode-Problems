class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int curr=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]< curr){
                curr=prices[i];
            }
            else if(prices[i]- curr > maxPro){
                maxPro=prices[i]-curr;
            }          
            
        }
        return maxPro;
        
    }
}