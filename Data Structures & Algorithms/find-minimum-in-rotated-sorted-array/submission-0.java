class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
        // int start=0;int target = 
        // int right=nums.length-1;
        // while(start<=right){
        //     int mid=start+(right-start)/2;
        //     if(target==nums[mid]){
        //         return mid;
        //     }else if(nums[mid]<target){
        //         start = mid+1;
        //     }else if(nums[mid]>target){
        //         right = mid-1;
        //     }
        // }
       
    }
}
