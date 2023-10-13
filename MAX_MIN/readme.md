**Finding Maximum and Minimum of an Array using Sorting**

This folder contains a Java program to efficiently find the maximum and minimum elements of an array using a sorting approach. This approach ensures that the minimum element is the first element of the sorted array, and the maximum element is the last element. Here's how the algorithm works:

### Algorithm:

1. Initialize an array with elements.
2. Sort the array in ascending order using a sorting algorithm (in this case, `Arrays.sort()` is used).
3. The first element of the sorted array will be the minimum element.
4. The last element of the sorted array will be the maximum element.
5. Print the minimum and maximum elements.

### Solution:

[JAVA_SOLUTION](solution.java)

### Input

```
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output: Minimum element is: 3
Maximum element is: 35
```

### Output:

```
Minimum element is 1
Maximum element is 3000
```

### Complexity Analysis:

- Time Complexity: O(n log n) - The sorting process dominates the time complexity.
- Space Complexity: O(1) - No additional data structures are used.
- Number of Comparisons: O(n log n) - The number of comparisons is determined by the sorting algorithm used.

This approach is straightforward and provides a quick way to find the minimum and maximum elements in an array using sorting. Please feel free to use, modify, or contribute to this repository as needed.
