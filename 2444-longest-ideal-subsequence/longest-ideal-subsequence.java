class Solution { 
    public int longestIdealString(String s, int k) {
        int dp[] = new int[26];
        
        int answer = Integer.MIN_VALUE;
        
        for(int i=s.length()-1; i>=0; i--){

            int index = s.charAt(i)-'a';
            
            int max = Integer.MIN_VALUE;
            
            int left = Math.max((index-k), 0); 
            int right = Math.min((index+k), 25);
            
            for(int j=left; j<=right; j++){
                max = Math.max(max, dp[j]);
            }
            
            dp[index] = max+1;
            
            answer = Math.max(answer, dp[index]);
        }
        
        return answer;
    }
}