package org.gautham.algorithm.search;

public interface Search<T extends Comparable<T>> {

  public int search(T[] arr, T target);
}
