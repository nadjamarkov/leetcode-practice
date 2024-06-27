class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]<buyingPrice) buyingPrice = prices[i];
            if(prices[i]-buyingPrice > profit) profit = prices[i]-buyingPrice;
        }
        return profit;
    }
}
