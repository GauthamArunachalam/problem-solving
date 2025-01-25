package org.gautham.algorithm.sort;

import org.gautham.inputreader.ConsoleInputDataReader;
import org.gautham.inputreader.InputDataProvider;

import java.util.Arrays;

public class SelectionSort implements Sort {

  /**
   * Performs selection sort on the array.
   * The passed in array will be sorted.
   * @param int[] - unsorted arr as input*/
  @Override
  public void sort(int[] arr)  {
    for (int i = 0; i < arr.length - 1; i++) {
      int smallestIndex = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] < arr[smallestIndex]) {
          smallestIndex = j;
        }
       }

      int temp = arr[smallestIndex];
      arr[smallestIndex] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    InputDataProvider idp = new ConsoleInputDataReader();
    int[] arr = idp.getIntArr();
    SelectionSort sort = new SelectionSort();
    sort.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
