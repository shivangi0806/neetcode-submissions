class Solution {
    public boolean canJump(int[] nums) {
        int count=0;
        int i=0;
        int maxreach=0;
       while(count<=nums.length-1 && i<=nums.length-1){
        if(i>maxreach){
            return false;
        }else{
           maxreach=
           Math.max(maxreach,i+nums[i]);
        i++;
        }
        if(maxreach==nums.length-1){
            return true;
        }
       
       }
       
       return true;
    }
}
