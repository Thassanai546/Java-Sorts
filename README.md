#  :stars: Java-Sorts :stars:
This program shows the implementation of different types of sorting algorithms in Java.

### Bubble Sort
* It is a comparison sort. 
* Performs poorly in real world and is mainly used for education. 
* Fast enough when you have small data sets.

>Step through array and check if elements are out of order. If they are then swap them, else move on. I used a swap method here which takes an array and two index positions as parameters.

### Counting Sort
* Uses key values as indexes into an array. 
* It is not a comparison sort. 
* This algorithm is often used as a subroutine in the radix sort. 

>Sorts elements of an array by counting the number of occurrences of each unique element in an input array. This count is stored in a new array count[]. Some arithmetic is done to calculate the positions of each element in the output array.

### Selection Sort
* Inefficient for large lists
* Requires n-squared number of steps for sorting n elements
* Works well on small lists.

>Find smallest value, then swap with first position.\
Find next smallest value, swap with second position.\
and so on until array is sorted.


### Quick Sort
* Very popular algorithm that is often regarded as the best for sorting.
* Divide and conquer algorithm.
* Requires n(log n) time to sort n items
* If implemented well, can be faster than merge sort.
* Sub-arrays sorted recursively.
> Partitions list of items into two sublists. A "Pivot" is used to do this. Elements in the first sublist are elements that are smaller than the pivot while all elements in the second sublist are larger than the pivot. This partitioning and arranging process is performed repeatedly on resulting sublists until the array is sorted.

### Insertion Sort
* Not great for large lists.
* Adaptive (efficient for data sets that may already be partially sorted).
* Stable, does not change relative order of elements with equal keys.
* Online, can sort a list as it receives it.
>When people sort cards in a hand, most use a method similar to insertion sort. As the algorithm runs a growing list of sorted values is created. Each iteration consumes one input value.
