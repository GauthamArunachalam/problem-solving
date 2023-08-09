package blind75;

import java.util.Scanner;

public class BesTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices){
        int lowerInd =0, higherInd=0, maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < prices[lowerInd]){
                if(maxProfit < prices[higherInd] - prices[lowerInd]){
                    maxProfit = prices[higherInd] - prices[lowerInd];
                }
                lowerInd = i;
                higherInd = i;
                continue;
            }

            if(prices[i] > prices[higherInd]){
                higherInd = i;
                if(maxProfit < prices[higherInd] - prices[lowerInd]){
                    maxProfit = prices[higherInd] - prices[lowerInd];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int n = scan.nextInt();
        int prices[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            prices[i] = scan.nextInt();
        }

        System.out.println(maxProfit(prices));
    }
}
