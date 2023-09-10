package utils;

import java.util.Scanner;

public class InputDataReader {

    private Scanner scan;

    public InputDataReader(){
        this.scan = new Scanner(System.in);
    }

    public int readSingleInt(){
        System.out.println("Enter the input number : ");
        return scan.nextInt();
    }

    public String readSingleString(){
        System.out.println("Enter string value : ");
        return scan.next();
    }

    public String readStringFullLine(){
        System.out.println("Enter string value : ");
        return scan.nextLine();
    }

    public int[] readIntArr(){
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public int[][] read2DIntArr() {
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

    public Integer[] readWrapperIntArr(){
        System.out.println("Enther the number of elements : ");
        int n = scan.nextInt();

        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            String temp = scan.next();
            if(temp.equals("null")){
                arr[i] = null;
            }else{
                arr[i] = new Integer(temp);
            }
        }
        return arr;
    }


    public char[] readCharArr(){
        System.out.println("Enter the input arr as a string : ");
        String value = scan.next();
        return value.toCharArray();
    }

    public String[] readStringArr(){
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt();

        String strArr[] = new String[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            strArr[i] = scan.next();
        }
        return strArr;
    }

    public String[] readStringFullLineArr(){
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt();

        String strArr[] = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+ (i+1) +" elements : ");
            strArr[i] = scan.nextLine();
        }
        return strArr;
    }

    public double readSingleDouble(){
        System.out.println("Enter the double value : ");
        double doubleVal = scan.nextDouble();
        return doubleVal;
    }
}
