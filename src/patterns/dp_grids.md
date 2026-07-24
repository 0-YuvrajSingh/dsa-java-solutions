# DP - Grid Pattern

## When to Use
- Matrix traversal with constraints
- Unique paths / minimum path sum
- Maximal square / rectangle in matrix

## Template
```java
int[][] dp = new int[m][n];
dp[0][0] = grid[0][0];
for (int i = 1; i < m; i++) dp[i][0] = dp[i-1][0] + grid[i][0];
for (int j = 1; j < n; j++) dp[0][j] = dp[0][j-1] + grid[0][j];
for (int i = 1; i < m; i++) {
    for (int j = 1; j < n; j++) {
        dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Maximal Square | dp/MaximalSquare | Medium |
| Set Matrix Zeroes | arrays/SetMatrixZeroes | Medium |
