// You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

// Example 1:

// Input: coins = [1, 2, 5], amount = 11
// Output: 3 
// Explanation: 11 = 5 + 5 + 1
// Example 2:

// Input: coins = [2], amount = 3
// Output: -1
// Note:
// You may assume that you have an infinite number of each kind of coin.

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[][] t = new int[coins.length+1][amount+1];
        for(int j=0;j<=amount;j++)
            t[0][j] = Integer.MAX_VALUE-1;
        for(int j=1;j<=amount;j++)
            if((j%coins[0]) == 0 )
                t[1][j] = j/coins[0];
            else
                t[1][j] = Integer.MAX_VALUE-1;
        for (int i = 2; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j >= coins[i - 1]) {
                    // Either we will take it or not
                    t[i][j] = Math.min(t[i - 1][j], 1 + t[i][j - coins[i - 1]]);
                } else if (j < coins[i - 1]) {
                    // We wont take it
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        if(t[coins.length][amount] == Integer.MAX_VALUE-1)
            return -1;
    return t[coins.length][amount];
    }
}