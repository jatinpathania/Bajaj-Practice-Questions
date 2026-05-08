class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int bestb  = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestb){
                m=Math.max(m,prices[i]-bestb);
            }
            bestb=Math.min(bestb,prices[i]);
        }
        return m;
    }
}