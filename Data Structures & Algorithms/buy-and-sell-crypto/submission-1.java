class Solution {
    public int maxProfit(int[] prices) {
        int currprofit=0;
        int max=0;
        int bp=0;
        int sp=0;
       while(sp<prices.length){

       if(prices[sp]<prices[bp]){
                bp=sp;
       }else{
        currprofit=prices[sp]-prices[bp];
        if(max<currprofit){
        max=currprofit;
       }
       }
       sp++;
        }
        return max;
    }
}
