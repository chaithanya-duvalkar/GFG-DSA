// Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

// Note: Stock must be bought before being sold.

// Examples:

// Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
// Output: 8
// Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
// Input: prices[] = [7, 6, 4, 3, 1]
// Output: 0 
// Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
// Input: prices[] = [1, 3, 6, 9, 11]
// Output: 10 
// Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
public class stockSingle {
    public static int singletransaction(int prices[])
    {
        int max_profit=0;
        int buy_price=Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            if(buy_price<prices[i])
            {
                int profit=prices[i]-buy_price;
                max_profit=Math.max(profit,max_profit);

            }
            else 
            {
                buy_price=prices[i];
            }
        }
        return max_profit;
    }
}
