class MinHeap {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    /**
     * add --> to add element to the queue. O(log n)
remove --> to get and remove the min/max. O(log n)
peek --> to get, but not remove the min/max. O(1)
     */
}