package org.gautham.algorithm.sort;

/**
 * Quick Sort implementation for an int array using Hoare's Partition algorithm.
 * */
public class QuickSort implements Sort {

  /*
  * Partition algorithm to split the array based on the pivot element
  * This implementation considers the last element in the range as the pivot element
  * Due to this implementation time complexity of on sorted arrays will be O(n^2)
  * */
  private int partition(int[] a, int lo, int hi) {
    int pivot = a[hi];

    int leftPt = lo, rightPt = hi;
    while (leftPt < rightPt) {
      while (leftPt < hi && a[leftPt] <= pivot) {
        leftPt++;
      }

      while (rightPt > lo && a[rightPt] > pivot) {
        rightPt--;
      }

      if (leftPt > rightPt) {
        break;
      }

      int temp = a[leftPt];
      a[leftPt] = a[rightPt];
      a[rightPt] = temp;
    }


    return leftPt;
  }

  /*
  * Recursive method to call quick sort itself by partitioning the array and calling the method on segments of the arr.
  * */
  private void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);

      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot, high);
    }
  }

  /**
   * Sort method that implements Quick sort with Hoare's Partition.
   * */
  @Override
  public void sort(int[] arr) {
      int low = 0, high = arr.length - 1;
      quickSort(arr, low, high);
  }

}
