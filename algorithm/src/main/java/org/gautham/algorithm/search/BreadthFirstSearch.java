package org.gautham.algorithm.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

  /**
   * This method returns the BFS order of a passed in graph in respect to the source
   * This method expects graph to be represented in adjacencyList.
   * @param adjacencyList - {@link Map} graph represented in adjacencyList format
   * @param source - the source element to start bfs from
   * @return {@link List} - BFS order of the graph elements.*/
  public List<Integer> breadthFirstSearch(Map<Integer, List<Integer>> adjacencyList, int source) {
    List<Integer> retVal = new ArrayList<>();

    Queue<Integer> queue = new LinkedList<Integer>();
    boolean[] visited = new boolean[adjacencyList.size()];

    queue.add(source);

    while (!queue.isEmpty()) {
      int currentNode = queue.remove();

      if (!visited[currentNode]) {
        visited[currentNode] = true;
        retVal.add(currentNode);
        queue.addAll(adjacencyList.get(currentNode));
      }
    }


    return retVal;
  }
}
