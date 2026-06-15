class Solution {
    private int maxProfit1(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int minStart = 0, maxEnd = 0, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[minStart]) {
                minStart = i;
                if (minStart > maxEnd) {
                    maxEnd = i;
                }
            } else if (prices[i] > prices[maxEnd]) {
                maxEnd = i;
            }
            maxProfit = Math.max(maxProfit, prices[maxEnd] - prices[minStart]);
        }
        return maxProfit;
    }
}
