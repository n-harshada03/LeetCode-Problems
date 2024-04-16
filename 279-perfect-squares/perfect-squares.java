class Solution {
    public int numSquares(int n) {
        int m = (int)Math.sqrt(n);
        ArrayList<Integer> sqrt = new ArrayList<>();

        for (int i = 1; i <= m; i++) {
            sqrt.add(i * i);
        }
        int ans=pSquares(sqrt,n);

        return ans;
    }

    public static int pSquares(ArrayList<Integer> sqrt,int n){
        int m=sqrt.size();

        int t[][]=new int[m+1][n+1];

        for (int i=0;i<m+1;i++){
            for (int j=0;j<n+1;j++){
                if(i==0){
                    t[i][j]=Integer.MAX_VALUE;
                }
                if(j==0){
                    t[i][j]=0;
                }
            }
        }

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(sqrt.get(i-1)<=j){
                    t[i][j]=Math.min(t[i-1][j] , 1+ t[i][j-sqrt.get(i-1)]);
                }
                else
                    t[i][j]= t[i-1][j];
            }
        }
        return t[m][n];

    }
}