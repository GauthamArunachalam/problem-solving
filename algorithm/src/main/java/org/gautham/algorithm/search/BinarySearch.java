package org.gautham.algorithm.search;

public class BinarySearch<T extends Comparable<T>> implements Search<T>{

  @Override
  public int search(T[] arr, T target) {
    int low = 0, high = arr.length -1 ;

    while (low <= high) {
      int mid = (low + high) / 2;
      T guess = arr[mid];
      if (guess.equals(target)) {
        return mid;
      } else if (guess.compareTo(target) > 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1;
  }
}
