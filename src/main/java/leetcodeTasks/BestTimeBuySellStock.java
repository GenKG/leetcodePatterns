package leetcodeTasks;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeBuySellStock {
    public static void main(String[] args) {
        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();
        bestTimeBuySellStock.maxProfit(new int[]{7,1,5,3,6,4});
    }
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int longestSubstring = 0;
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else {
                longestSubstring = Math.max(longestSubstring, price - minprice);
            }
        }
        return longestSubstring;
    }
}
