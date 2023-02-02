import java.util.*;

import static java.util.Collections.reverse;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] input = {7,6,4,3,1};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(input));
    }

   /* public int maxProfit(int[] prices) {
            int max_profit=Integer.MIN_VALUE;
            int profit=0;

        for(int a=0;a<prices.length;a++){
            for(int i=a+1;i<prices.length;i++){
                if(prices[i]-prices[a]>0&&prices[i]-prices[a]>max_profit){
                    profit=prices[i]-prices[a];
                   max_profit=Math.max(profit,max_profit);
                }
            }
        }

        return  max_profit>0 ? max_profit : 0;

    }*/
    //Solution 2
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}