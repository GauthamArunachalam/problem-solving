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
}
