class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
        // int start=0;int target = nums[0];
        // int right=nums.length-1;
        // while(start<=right){
        //   if(nums[start]<nums[right]){
        //     target=Math.min(nums[start],target);
        //     break;
        //   }
        //   int mid = start+(right-start)/2;
        //   target=Math.min(nums[mid],target);
        //   if(nums[mid]>=nums[start]){start=mid+1;}
        //   else{right=mid-1;}
        // }return target;
       
    }
}
