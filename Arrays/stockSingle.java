
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
