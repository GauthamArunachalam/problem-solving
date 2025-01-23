package org.gautham.inputreader;

import java.util.Scanner;

public class ConsoleInputDataReader implements InputDataProvider {

  private Scanner scan;

  public ConsoleInputDataReader() {
    scan = new Scanner(System.in);
  }

  @Override
  public int getSingleInt() {
    System.out.println("Enter the input number : ");
    return scan.nextInt();
  }

  @Override
  public int[] getIntArr() {
    System.out.println("Enter the number of elements : ");
    int n = scan.nextInt();

    int arr[] = new int[n];
    for(int i=0; i<n;i++){
      System.out.println("Enter the "+ (i+1) +" element : ");
      arr[i] = scan.nextInt();
    }
    return arr;
  }

  @Override
  public int[][] get2DIntArr() {
    System.out.println("Enter the number of rows : ");
    int row = scan.nextInt();

    System.out.println("Enter the number of columns : ");
    int col = scan.nextInt();
    int[][] mat = new int[row][col];
    for (int i=0; i<row; i++) {
      for (int j=0; j<col; j++) {
        System.out.println("Enter "+ i +" X "+ j +" element : ");
        mat[i][j] = scan.nextInt();
      }
    }
    return mat;
  }

  @Override
  public String getSingleWord() {
    System.out.println("Enter string value : ");
    return scan.next();
  }

  @Override
  public String getFullLine() {
    System.out.println("Enter string value : ");
    return scan.nextLine();
  }

  @Override
  public String[] getStringArr() {
    System.out.println("Enter the number of elements : ");
    int n = scan.nextInt();

    String strArr[] = new String[n];
    for(int i=0; i<n;i++){
      System.out.println("Enter the "+ (i+1) +" element : ");
      strArr[i] = scan.next();
    }
    return strArr;
  }
}
