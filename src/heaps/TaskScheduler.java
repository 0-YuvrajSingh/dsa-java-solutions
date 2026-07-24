// Pattern: Greedy + Heap (Task Scheduler)
// Difficulty: Medium

import java.util.*;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) if (f > 0) pq.offer(f);

        int intervals = 0;
        while (!pq.isEmpty()) {
            int cycle = n + 1;
            List<Integer> temp = new ArrayList<>();

            while (cycle > 0 && !pq.isEmpty()) {
                int val = pq.poll();
                if (val > 1) temp.add(val - 1);
                intervals++;
                cycle--;
            }

            for (int v : temp) pq.offer(v);
            if (!pq.isEmpty()) intervals += cycle;
        }
        return intervals;
    }
}