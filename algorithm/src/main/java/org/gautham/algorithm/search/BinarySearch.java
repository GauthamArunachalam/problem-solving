package org.gautham.algorithm.search;

import org.gautham.inputreader.ConsoleInputDataReader;
import org.gautham.inputreader.InputDataProvider;

public class BinarySearch {

  /**
   * Performs binary search on the input arr for the target element
   * @param int[] - A sorted int array to perform the binary search
   * @param int - target element to search for in the array
   * @return int - index of the target element in the array. If the target element is not present in the arr -1 will be returned*/
  public int search(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = arr[mid];

      if (guess == target) {
        return mid;
      } else if (guess > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }
}
