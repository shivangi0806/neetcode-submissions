class Solution {
    public int hammingWeight(int n) {
        int i=0;
        int bitmask=1;int c=0;
       while(i<32){
        int counter=   n &  (1<<i) ;

       if(counter!=0){
             c++;
       }
       i++;
       } 

       return c;
    }
}
