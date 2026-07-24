// Pattern: Heap Implementation (Min Heap)
// Difficulty: Medium

class MinHeap {
    int[] heap;
    int size;
    int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }

    public void insert(int val) {
        if (size == capacity) return;
        heap[size] = val;
        int current = size;
        size++;
        while (current > 0 && heap[(current - 1) / 2] > heap[current]) {
            swap(current, (current - 1) / 2);
            current = (current - 1) / 2;
        }
    }

    public int extractMin() {
        if (size == 0) return -1;
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        minHeapify(0);
        return min;
    }

    private void minHeapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}