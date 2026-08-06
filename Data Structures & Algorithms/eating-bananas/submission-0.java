class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int n=piles[0];
        for(int i =0;i<piles.length;i++){
            if(piles[i]>n){
              n = piles[i];
            }
        }
        
         int start=1;
         int e = n;
         int finalanswer=0;
         while(start<=e){
            int hours=0;
            int r = start+(e-start)/2;
            for(int i=0;i<piles.length;i++){
                hours+= (piles[i]+r-1)/r;
            }
            if(hours<=h){
              finalanswer=r;
              e=r-1;
            }else{start = r+1;}
         }
         return finalanswer;
    }
}
