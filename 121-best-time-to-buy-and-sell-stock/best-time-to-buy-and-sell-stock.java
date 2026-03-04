class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max_profit=0;
        for(int num:prices)
        {
            min=Math.min(min,num);
            max_profit=Math.max(max_profit,num-min);
        }
        return max_profit;
        
    }
}