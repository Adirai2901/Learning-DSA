public class _121_ {
    class Solution {
        public int maxProfit(int[] prices) {
            int profit = 0 , minp = Integer.MAX_VALUE;
    
            for(int num : prices){
                if(num < minp){
                    minp = num;
                }
                profit = Math.max(profit ,num-minp);
            }
            return profit;
        }
    }
}
