class Solution {
    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed_s=sb.toString();
        
        int LPS=LCS(s,reversed_s);

        int result=s.length()-LPS;
        return result;
        
    }
    public static int LCS(String s,String reversed_s){
        int n=s.length();
        int t[][]=new int [n+1][n+1];

        for(int i=0;i<n+1;i++){
            for (int j=0;j<n+1;j++){
                if(n==0){
                    t[i][j]=0;
                }
            
            }
        }

        
        for(int i=1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                if(s.charAt(i-1)==reversed_s.charAt(j-1)){
                    t[i][j]= 1+ t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j] , t[i][j-1]);
                }
            
            }
        }
        return t[n][n];
        

    } 
}