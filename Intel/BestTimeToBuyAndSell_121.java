package Intel;

public class BestTimeToBuyAndSell_121 {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxP = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > maxP)
                maxP = prices[i] - min;
        }
        return maxP;
    }

    // public int maxProfit(int[] prices) {
    // int max = 0;
    // for(int i = 0; i < prices.length; i++) {
    // for(int j = i + 1; j < prices.length; j++) {
    // if(prices[j] > prices[i]) {
    // max = Math.max(max, prices[j] - prices[i]);
    // }
    // }
    // }
    // return max;
}
