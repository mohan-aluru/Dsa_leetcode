class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int maxprofit=0;
      for(int i=1;i<prices.length;i++){
        if(prices[i]<prices[i-1]){
            profit+=maxprofit;
            maxprofit=0;
            min=prices[i];
         }else  if(min>prices[i]){
            min=prices[i];
         } 
         else{
            maxprofit=Math.max(maxprofit,prices[i]-min);
         }
      }
      if(maxprofit>0){
        profit+=maxprofit;
      }  
      return profit;
    }
}