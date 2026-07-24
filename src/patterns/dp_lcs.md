# DP - LCS Pattern (Longest Common Subsequence)

## When to Use
- "Longest common subsequence/substring"
- Edit distance
- String transformation problems

## Template
```java
int[][] dp = new int[m + 1][n + 1];
for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= n; j++) {
        if (s1.charAt(i-1) == s2.charAt(j-1))
            dp[i][j] = 1 + dp[i-1][j-1];
        else
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
    }
}
return dp[m][n];
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Edit Distance | dp/EditDistance | Hard |
| Fibonacci (DP basics) | dp/Fibonacci | Easy |
