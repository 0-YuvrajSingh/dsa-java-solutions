// Pattern: Greedy (Minimum Coins - Greedy for Standard Denominations)
// Difficulty: Medium

class MinimumCoins {
    public int minCoins(int[] coins, int amount) {
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return amount == 0 ? count : -1;
    }
}