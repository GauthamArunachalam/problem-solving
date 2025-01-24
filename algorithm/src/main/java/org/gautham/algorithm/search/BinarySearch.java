package org.gautham.algorithm.search;

import org.gautham.inputreader.ConsoleInputDataReader;
import org.gautham.inputreader.InputDataProvider;

public class BinarySearch {

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

  public static void main(String[] args) {
    InputDataProvider idp = new ConsoleInputDataReader();

    int[] arr = idp.getIntArr();
    int target = idp.getSingleInt();

    BinarySearch bs = new BinarySearch();
    System.out.println(bs.search(arr, target));
  }
}
