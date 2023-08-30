package leetcode;

import utils.InputDataReader;

public class L2469ConvertTemperature {

    public static double[] convertTemperature(double celsius){
        return new double[]{celsius + 273.15, (celsius *1.8) + 32.00};
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        double celsius = inputDataReader.readSingleDouble();

        double[] ans = convertTemperature(celsius);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+ " ");
        }
    }
}
