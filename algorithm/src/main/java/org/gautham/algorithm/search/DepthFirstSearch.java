package org.gautham.algorithm.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DepthFirstSearch {

  /**
   * This method returns the DFS order of a passed in graph in respect to the source
   * This method expects the graph to be represented in adjacencyList
   * This implementation first tried to go depth wise based on the last element of the array and then processes the other elements
   * To do first child wise DFS we can use recursive.
   * @param adjacencyList - {@link Map} graph represented in adjacencyList format
   * @param source - the source element to start dfs from
   * @return  {@link List} - DFS order of the graph element*/
  public List<Integer> depthFirstSearch(Map<Integer, List<Integer>> adjacencyList, int source) {
    List<Integer> retVal = new ArrayList<Integer>();

    Stack<Integer> stack = new Stack<>();
    boolean[] visited = new boolean[adjacencyList.size()];

    stack.push(source);

    while (!stack.isEmpty()) {
      int curr = stack.pop();

      if (!visited[curr]) {
        retVal.add(curr);
      }
      visited[curr] = true;

      for (int neighbor : adjacencyList.get(curr)) {
        if (!visited[neighbor]) {
          stack.push(neighbor);
        }
      }
    }

    return retVal;
  }
}
