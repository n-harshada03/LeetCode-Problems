class Solution {

    public int maxFind(int grid[][], int x, int y) {

        int max = Integer.MIN_VALUE;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }
        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] newGrid = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                newGrid[i][j] = maxFind(grid, i, j);
            }
        }
        return newGrid;
    }
}