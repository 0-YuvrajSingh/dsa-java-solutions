# DP - Knapsack Pattern

## When to Use
- Subset sum, partition equal subset
- 0/1 Knapsack, Unbounded Knapsack
- Coin change, target sum

## Template - 0/1 Knapsack
```java
int[][] dp = new int[n + 1][W + 1];
for (int i = 1; i <= n; i++) {
    for (int w = 0; w <= W; w++) {
        if (wt[i-1] <= w)
            dp[i][w] = Math.max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w]);
        else
            dp[i][w] = dp[i-1][w];
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Coin Change | dp/CoinChange | Medium |
| Target Sum | dp/TargetSum | Medium |
| Partition Equal Subset | dp/PartitionEqualSubset | Medium |
| Partition with Given Diff | dp/PartitionWithGivenDiff | Medium |
| Last Stone Weight II | dp/LastStoneWeightII | Medium |
| Profitable Schemes | dp/ProfitableSchemes | Hard |
| Frog Jump | dp/FrogJump | Easy |
| Frog Jump K | dp/FrogJumpK | Medium |
| Ninja Training | dp/NinjaTraining | Medium |
| House Robber | dp/HouseRobber | Medium |
| House Robber II | dp/HouseRobber2 | Medium |
| Word Break | dp/WordBreak | Medium |
