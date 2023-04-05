# Theory of A&DS

## Table of Contents
1. [Big-O Notation](#big-o-notation)
2. [Sorting Algorithms](#sorting-algorithms)
3. [Arrays](#arrays)
4. [Array Lists](#array-lists)
5. [Queues](#queues)
6. [Priority Queues](#priority-queues)
7. [Trees](#trees)
8. [Heaps](#heaps)
9. [Stacks](#stacks)
10. [Maps](#maps)
11. [Graphs](#graphs)
12. [Strings and Text Processing](#strings-and-text-processing)
    - [Matching Algorithms](#matching-algorithms)
    - [Tries](#tries)
    - [Concatenation](#concatenation)
13. [Hashing and HashMaps](#hashing-and-hashmaps)
14. [Implementation Tricks](#implementation-tricks)

## Big-O Notation
- Big-O is a representation of the growth rate of a function which is how the running rate varies with input size for the worst case scenario
- Common time complexities in order of speed and common occurrences
    1. Constant - **O(1)**
        - Single calculation and some primitives
    2. Logarithmic - **O(log n)**
        - Proccessing of list of n items splitting list in half at each step
    3. N-Log-N - **O(nlog n)**
        - Iterating through a list of pre-sorted numbers to compute value
    4. Linear - **O(n)**
        - Looping through all items in a list
    5. Quadratic - **O(n^2)**
        - Nested for loops and 2D arrays
    6. Polynomial - **O(n^k)**
        - Nested at depth `k` and `k` dimensional arrays
    7. Exponential - **O(e^n)**
        - Loops where the number of operations double with each iteration
- Amortisation

## Sorting Algorithms

## Arrays
- Linear data structure storing elements in a sequence of consecutive memory cells with the size specified at creation
- Inserting 
    - Shift the position to maintain order and insert into desired position
    - Time complexity is **O(n)**, if inserted element is at start forcing full right shift and resizing
- Accessing
    - Accessing is **O(1)**
- Iteration
    - Iterating over is length of array by accessor time, **O(n)**
- Deleting
    - Same as insertion, **O(n)** as elements must be shifted to fill the removal gap
- Memory usage
    - Requires memory for each element, **O(n)**


## Array Lists
- Arrays tend to have the limit that they are fixed time, array lists are an abstract data type which allow for expansion
- Operations in ArrayList<>
    - Inserting is done via `add(i,o)` which inserts at i and shifts elements backwards, so **O(n)** for inserting at start
    - Removal at an index is `remove(i)` which runs in **O(n)** due to shifting if index is 0
    - Accessing is constant time with index known
- Array lists can be growable by accounting for when adding exceeds array size, we replace the array with a new array
    - `push(o)` adds o to the end of an array
    - If pushing, the time is amortised **O(n)** for incremental increases in array size
    - We can use the double size for the operation to be **O(1)** as we simply double the size when it exceeds


## Queues
- A queue inserts elements at the end then retrieves from the start
    - Called first-in, last-out or FILO
- Operations for direct implementation
    - Insertion is done through `enqueue(T)` which adds element to the end of the queue
    - Removal is done via `dequeue()` always from the front of the queue and returns it
    - First value can be viewed without removal via `first()`
    
## Priority Queues
- Queue data structure which stores (key, value) pairs
- When retrieving an element, the entry with the highest priority is returned (the lowest key)
- Priority queue is an abstract data type
    - Implementation requires a getKey and getValue method
    - Unsorted list implementation
        - Allows for insertion in **O(1)**
        - Removal takes **O(n)**
    - Sorted list implementation
        - Insertion takes **O(n)** as it needs to find the spot to insert
        - Removal takes **O(1)** as the smallest key will be at the beginning of the list

## Trees
- Hierarchial data structure consisting of nodes with parent-child relationships
- Terminiology
    - **Root** is the first or top node in the tree (it has no parent)
    - **Internal node** is a node with a child
    - **External node** is a leaf, or node without children
    - An **edge** connects two nodes
    - **Depth** is the number of edges from the node to the root
    - **Height** is the number of edges on the longest path from the node to the leaf
- Trees requiring traversing for accessing
    - **Preorder traversal** is when a node is visited before it's descendants
    - **Postorder traversal** is when a node is visited after it's descendants, starts at children and works along siblings then up a level to the parent
    - **Breadth first traversal** is visiting all nodes at depth `d` before visiting nodes at depth `d+1`
- Binary search trees are a common implementation for searching
    - Searching takes **O(logn)**, with adding/removal taking **O(n)**
    - Keys are stored in internal nodes and external nodes do not store items
    - In-order traversal of binary tree visits the keys in increasing order

## Heaps
- Binary tree storing keys at the node
- Heap properties
    - Heap-order
        - Every internal node is equal to or greater than that of the parent
        - Root node has the lowest key and hence highest priority
        - When inserting/removing, property must be maintained with upheaping
    - Complete binary tree
        - Internal nodes are to the left of external nodes
- Operations available 
    - Insertion
        - Find the insertion node `z`, store `k` at `z` then perform upheap to restore order
    - Upheap
        - Following insertion, keys must be swapped along the upward path to the root to ensure heap-order property is not violated
        - Upheaping runs in **O(logn)**
    - Removal or removeMin
        - For removeMin, the root node is replaced with the last key which is consequently removed
        - Downheap is performed to restore order
    - Downheap
        - Downheaping runs in **O(logn)**
        - After removal at the root, swap keys downwards to the leaves to maintain order
- Above can be used for priority queue abstract data type implementation
- Heaps can be implemented with arrays
    - `n` keys represents an array of `n` elements
    - For a node at rank `i`, the left child is at `2i+1` and the right child is at `2i+2`
    - Inserting means inserting at `n`
    - Removal means removing the minimum which is at rank `n-1`
    - Heap order properties implemented with element value swapping

## Stacks
- A stack inserts elements at the top, then removes from the top
    - Called last-in, first-out (LIFO)
- Operations from direct implementation
    - Adding an element is done via `push(T)` to push onto the stack
    - Removal is done via `pop()` which removes the top element from the stack
        - If no elements or an exception, returns null
    - Top value can be read without removal via `top()`
    - Get the number of elements with `size()`
- Time complexity depends on implementation

## Maps
- Maps are searchable collections of key-value entries
- Keys are unique so search is done by indexing each key to get the value
- Operations
    - Accessing is done via `get` which runs in **O(1)** as value is known
    - Adding elements is done with `put(k, v)`
    - `remove(k)` removes the value at key `k`, if the value does not exist it returns null
        - Due to this, the map cannot store `null` at a key

## Graphs
- Graphs are data structure which contain `V` nodes/vertices and `E` edges connecting them nodes/vertices to each other
- The edges can be directed or undirected, resulting in one or bidirectional edges
- Terminology
    - An edge **incident** on a vertex is one which connects to it
    - Two vertices are **adjacent** if there exists an edge which connects them
    - The **degree** of a vertex is the number of edges which are connected to it
    - A **path** is a sequence of vertices/edges between two vertices, a path is **simple** if it contains unique vertices and edges
    - A **cycle** is path which starts and ends at the same vertex, it is **simple** if it contains unique vertices and edges
    - A graph `S` is a **subgraph** of `G` if all the vertices of `S` are a subset of the vertices of `G`
- Implementation of graphs 

## Strings and Text Processing
### Matching Algorithms

### Tries

### Concatenation

## Hashing and Hash Tables
- Hash code provide a way to map data types uniquely with minimal chance of two values having the same hash
    - Modulus operator provides a way for the value to effectively unreversible
- Hash table apply algorithms to convert data to an integer to map to a value
    - 

## Implementation Tricks
- Input is sorted?
    - Find an element using [binary search]() in **O(log n)**
- Input is a binary tree?
    - Find an element using [DFS]() for pre, in or postorder in **O(n)**
    - [BFS]() for level order in **O(n)** 
- Input is a graph?
    - Use [DFS]() which runs in **O(n)** implemented with recursrion or a stack
    - Alternatively, use [BFS]() which runs in **O(n)** implemented with a queue
- Find the top/least `k`th element
    - [QuickSelect]() averages **O(n)** but can be **O(n^2)**
    - [Heap]() is an alternative running in **O(n log k)**
- Sorting problem?
    - [QuickSort]() runs in **O(n log n)** average but can be **O(n^2)**
    - Mergesort runs in **O(n log n)** always
    - Most languages with built-in sorts will use mergesort
- Finding distance in trees or graphs
    - [BFS]() for non-weighted problems runs in **O(n)**
    - Dijkstra is it is not weighted runs in **O(E log V)**

## Common Pattern Solutions
### Windowing
- Matches problems which involve windowing an array or linked list, such as when finding subarrays or consecutive elements matching a pattern
- Starting at first element, and shifts right by 1 and adjusts the length of the window according to the problem

### Two Pointers / Iterators
- Pattern where two points iterate through data in tandem until certain conditions are meta
- Matches problems when searching pairs in a sorted array or linked list
- Used for summing match problems or comparing strings
- Can also be applied to fast and slow pointers which is useful when dealing with cyclic data structures
- Used for problems with loops in a linked list or determining index with known length

### Merge Intervals
- Pattern for dealing with overlapping intervals where two intervals can relate to each other in 6 ways with overlap

### Cyclic Sort
- Matches problems dealing with integer arrays containing numbers in a specified range
- Iterate over a list and if the current number is not at the correct index, swap it 

### Reversal Linked-list
- Patterns matching reversing the links between nodes in a linked list 
- Start with the current node pointing to the head of the linked list and the previous will point to the previous processed node
Reverse the current node by pointing it to the previous before moving to the next node
- Always update the previous to point to the previous node that has been processed

### Tree BFS and DFS
- BFS is a tree traversal using a queue to keep track of nodes at a level for level-by-level order
- Functions by pushing root node to the queue, removing each node from the queue and inserting all children into the queue
- DFS is a recursive means of traversing starting at the root and checking children


### Two Heap
- Matches problems where elements can be divided into two parts and need to know the smallest/biggest element
- Employs a min heap to find the smallest element and a max heap to find the biggest
- Stores the first half of numbers in the first half and the second half in a min heap to determine biggest/smallest
- Median of the current list can be calculated from the top element of the two heaps

### Subsets
- Matches permutations and combination style questions through a BFS approach
- Given a set of values, create an empty set, and then add each element to all existing subsets


### Binary Search - Modified
- Matches problems with a sorted array, linked list or matrix to find an element
- Process
    1. Find the middle index such as `(start + end)/2` but this can overflow so `start + (end - start)/2`
    2. If key is equal to the number at index, then return middle
    3. Else, check if `key < arr[middle]`. If true, reduce search to `end=middle-1` else `end=middle+1`


### Top K Elements
- Matches problems asking to find the top, smallest or most frequent `K` element(s) among a given set
- Heaps are the best data structure for keeping track of elements
    1. Insert `K` elements into min/max heap depending on task
    2. Iterate through the remaining numbers and if one is found that is larger than what is in the heap then remove that number and insert the larger one


### K-Way Merge
- Given `k` sorted arrays, need to traverse elements
- Push the smallest element of each array into a min heap to get the minimum, with the minimum, push the next element
    1. Insert the first element of each array into a min heap
    2. Remove the smallest element from the heap and add to the merged list
    3. Insert the next element of the list into the heap
    4. Repeat 2,3 to create a merge list in sorted order
