class Solution {
    public int[] twoSum(int[] nums, int target) {
     int h[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                h[0]=Math.min(i,j);
                h[1]=Math.max(i,j);
            }
            }
        }
        return h;
    }
}
