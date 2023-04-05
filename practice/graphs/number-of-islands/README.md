# 200. Number of Islands

## Prompt
Given an `m x n` 2D binary grid grid which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

## Example
```
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
```

## Solution
- Use breadth first search
- If we find a 1, we need to compute the size of the island turning all the 1s into zeroes then increment the counter
- Find all connected 1s connected vertically and horizontally and flip the 1's