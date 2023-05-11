class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
        return helper(nums1, nums2, 0, 0, dp);
    }

    private int helper(int[] A, int[] B, int i, int j, int[][] dp) {
        if(i >= A.length || j >= B.length) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(A[i] == B[j]) 
            return dp[i][j] = Math.max(helper(A, B, i + 1, j + 1, dp) + 1, helper(A, B, i + 1, j, dp));
        else 
            return dp[i][j] = Math.max(helper(A, B, i + 1, j, dp), helper(A, B, i, j + 1, dp));
    }
}
