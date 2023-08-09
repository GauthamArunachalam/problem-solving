package blind75;

import utils.InputDataReader;


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
        InputDataReader inputDataReader = new InputDataReader();
        int prices[] = inputDataReader.readIntArr();

        System.out.println(maxProfit(prices));
    }
}
