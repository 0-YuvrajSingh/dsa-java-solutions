// Pattern: Min-Heap / Priority Queue
// LeetCode: 215 (Kth Largest Element in an Array)
// Difficulty: Medium

class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            heap.offer(nums[i]);

            while(heap.size() > k) heap.poll();
        }

        return heap.peek();
    }
}