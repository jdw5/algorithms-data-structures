# 206. Reverse Linked List

## Prompt
Given the head of a singly linked list, reverse the list, and return the reversed list.

## Example
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

## Solution
- Given the head of the linked list
- Iterate from head going forward then store the head as the previous for the next item in the LinkedList
- Go until end of list designated by the null