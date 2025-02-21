package org.gautham.algorithm.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchTest {

  private DepthFirstSearch dfs = new DepthFirstSearch();

  public DepthFirstSearchTest() {
    this.dfs = new DepthFirstSearch();
  }

  @Test
  public void baseCase() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, Arrays.asList(1, 3));
    graphRep.put(1, Arrays.asList(2, 3, 4));
    graphRep.put(2, List.of(3));
    graphRep.put(3, List.of(1));
    graphRep.put(4, Arrays.asList(0, 2));

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(Arrays.asList(0, 1, 3, 2, 4), bfsOrder);
  }

  @Test
  public void singleNode() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0), bfsOrder);
  }

  @Test
  public void twoNodes() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1));
    graphRep.put(1, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1), bfsOrder);
  }

  @Test
  public void chainCase() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1));
    graphRep.put(1, List.of(2));
    graphRep.put(2, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2), bfsOrder);
  }

  @Test
  public void treeCase() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1, 2, 3));
    graphRep.put(1, List.of());
    graphRep.put(2, List.of());
    graphRep.put(3, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2, 3), bfsOrder);
  }

  @Test
  public void cycleCase() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1));
    graphRep.put(1, List.of(2));
    graphRep.put(2, List.of(0));

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2), bfsOrder);
  }

  @Test
  public void cycleAndBranching() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1, 2));
    graphRep.put(1, List.of(2, 3));
    graphRep.put(2, List.of(0, 4));
    graphRep.put(3, List.of(4));
    graphRep.put(4, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2, 3, 4), bfsOrder);
  }

  @Test
  public void disconnectionGraph() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1));
    graphRep.put(1, List.of());
    graphRep.put(2, List.of(3));
    graphRep.put(3, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1), bfsOrder);
  }

  @Test
  public void disconnectedGraph() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1, 2));
    graphRep.put(1, List.of(0));
    graphRep.put(2, List.of());
    graphRep.put(3, List.of(4));
    graphRep.put(4, List.of(3, 5));
    graphRep.put(5, List.of(4));

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 3);
    assertEquals(List.of(3, 4, 5), bfsOrder);
  }

  @Test
  public void selfLoop() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(0, 1));
    graphRep.put(1, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1), bfsOrder);
  }

  @Test
  public void multiplePathsCase() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1, 2));
    graphRep.put(1, List.of(3));
    graphRep.put(2, List.of(3));
    graphRep.put(3, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2, 3), bfsOrder);
  }

  @Test
  public void biggerGraphs() {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Map<Integer, List<Integer>> graphRep = new HashMap<Integer, List<Integer>>();
    graphRep.put(0, List.of(1, 2, 0));
    graphRep.put(1, List.of(3, 4));
    graphRep.put(2, List.of(4));
    graphRep.put(3, List.of(5, 1));
    graphRep.put(4, List.of(5, 6));
    graphRep.put(5, List.of(7));
    graphRep.put(6, List.of(7, 8));
    graphRep.put(7, List.of(9));
    graphRep.put(8, List.of(9));
    graphRep.put(9, List.of());

    List<Integer> bfsOrder = bfs.breadthFirstSearch(graphRep, 0);
    assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), bfsOrder);
  }
}
