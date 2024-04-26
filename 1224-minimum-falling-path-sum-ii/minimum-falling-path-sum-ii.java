class Solution {
    int n;
    public int minFallingPathSum(int[][] grid) {
        this.n = grid.length;
        Integer[][] t = new Integer[n][n];
        int rslt = 0;
        return helper(0, -1, grid, t);
    }
    private int helper(int row, int col, int[][] grid, Integer[][] t){
        if (row == n){
            return 0;
        }
        if (col != -1 && t[row][col] != null)
            return t[row][col];
        int rslt = Integer.MAX_VALUE;
        if (row == 0){
            for(int j = 0; j < n; j++){
                rslt = Math.min(rslt, 
                        grid[row][j] + helper(row + 1, j, grid, t));
            }
            return rslt;
        } else {
            for(int j = 0; j < n; j++){
                if (j == col)
                    continue;
                int curr = grid[row][j] + helper(row+1, j, grid, t);
                rslt = Math.min(rslt, curr);
            }
        }

        t[row][col] = rslt;
        return t[row][col];
    }
}