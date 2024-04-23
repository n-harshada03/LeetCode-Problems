class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reversed = sb.reverse();
        int result = LCS(s, reversed.toString());

        return result;
    }

    public int LCS(String s, String b){
        int m=s.length();
        int n=b.length();
        int[][] t=new int[n+1][m+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    t[i][j]= 0;
                }
            }
        }

        for(int i= 1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==b.charAt(j-1)){ //always remerber its string characyter accessed by charAt()
                    t[i][j]= 1+ t[i-1][j-1];
                }
                else{
                    t[i][j] =Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }

        return t[m][n];
    }
}