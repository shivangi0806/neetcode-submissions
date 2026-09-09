class Solution {
    public int getSum(int a, int b) {
      //0 1 0
      //0 1 0
      //1  0  0
      int carry=(a&b)<<1; int sum = a^b;
      while(carry!=0){
       sum = a^b;
      carry = (a&b)<<1;a=sum;b=carry;
    //   getSum(sum,carry);
      }
      return sum;
    }
}
