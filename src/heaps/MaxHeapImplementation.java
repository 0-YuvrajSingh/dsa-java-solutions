// Pattern: Heap Implementation (Max Heap)
// Difficulty: Medium

class MaxHeap {
    int[] heap;
    int size;
    int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }

    public void insert(int val) {
        if (size == capacity) return;
        heap[size] = val;
        int current = size;
        size++;
        while (current > 0 && heap[(current - 1) / 2] < heap[current]) {
            swap(current, (current - 1) / 2);
            current = (current - 1) / 2;
        }
    }

    public int extractMax() {
        if (size == 0) return -1;
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeapify(0);
        return max;
    }

    private void maxHeapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && heap[left] > heap[largest]) largest = left;
        if (right < size && heap[right] > heap[largest]) largest = right;
        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}