// Pattern: Greedy (Job Sequencing Problem)
// Difficulty: Medium

import java.util.*;

class JobSequencing {
    public int[] jobScheduling(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);
        int maxDeadline = 0;
        for (int[] job : jobs) maxDeadline = Math.max(maxDeadline, job[1]);

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);
        int count = 0, profit = 0;

        for (int[] job : jobs) {
            for (int j = job[1]; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = job[0];
                    count++;
                    profit += job[2];
                    break;
                }
            }
        }
        return new int[]{count, profit};
    }
}