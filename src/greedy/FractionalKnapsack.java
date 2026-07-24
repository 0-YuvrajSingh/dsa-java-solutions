// Pattern: Greedy (Fractional Knapsack)
// Difficulty: Medium

import java.util.*;

class FractionalKnapsack {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        double[][] items = new double[n][2];
        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }

        Arrays.sort(items, (a, b) -> Double.compare(b[0] / b[1], a[0] / a[1]));

        double totalValue = 0;
        for (int i = 0; i < n; i++) {
            if (capacity >= items[i][1]) {
                totalValue += items[i][0];
                capacity -= (int) items[i][1];
            } else {
                totalValue += items[i][0] * (capacity / items[i][1]);
                break;
            }
        }
        return totalValue;
    }
}