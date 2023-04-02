# 238. Product of Array Except Self

## Prompt
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

## Example
```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

## Solution
### With Division

### Without Division
- Loop forward and then loop backward to calculate the products
- So you build up the array as the multiplied of the current by the previous
- Multiply the previous loop by the forward loop
