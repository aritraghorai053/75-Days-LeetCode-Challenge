class Solution {
    public int func(int i, int j, int[][]dp){
        if(i == 0 && j == 0) return 1;
        if(i <0 || j <0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        int up = func(i-1, j, dp);
        int left = func(i, j-1, dp);
        return dp[i][j] = up + left;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp)
        Arrays.fill(row,-1);

        return func(m-1, n-1, dp);   
    }
}