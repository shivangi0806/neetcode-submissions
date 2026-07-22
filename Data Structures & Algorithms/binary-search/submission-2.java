class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        int start=0;
        int right=nums.length-1;
        while(start<=right){
            int mid=start+(right-start)/2;
            if(target==nums[mid]){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
        }
        return -1;
    }
}
