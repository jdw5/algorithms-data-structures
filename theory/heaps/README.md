# Heaps
### Min Heap
- Min heap is a heap where the root node is the smallest in the tree and all internal nodes have a key value that is always or equal to children
- Methods
    - **Insertion** performed by adding a new key at the end of the tree. If the key value is smaller than parent, it is traversed upwards to fulfil heap property. Runs in **O(log n)**
    - **extractMin** is removal of the minimum value at the root, after removing heap order must be maintained. Runs in **O(log n)**
    - **getMin** is an accessor method to get the root node of the heap in **O(1)**