class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int nSquared = n * n;
        
        long expectedSum = (long) nSquared * (nSquared + 1) / 2;
        long expectedSumSquares = (long) nSquared * (nSquared + 1) * (2 * nSquared + 1) / 6;
        
        long actualSum = 0, actualSumSquares = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSumSquares += (long) grid[i][j] * grid[i][j];
            }
        }
        long diffSum = actualSum - expectedSum;

        long diffSumSquares = actualSumSquares - expectedSumSquares;
        
        long sumAB = diffSumSquares / diffSum;
        
        int a = (int) ((sumAB + diffSum) / 2);
        int b = (int) ((sumAB - diffSum) / 2);
        
        return new int[]{a, b};
    }
}