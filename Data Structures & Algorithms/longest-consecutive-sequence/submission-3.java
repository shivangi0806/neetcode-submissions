class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);int sum=1;int maxi=0; 
         if(nums.length==0){
                return 0;
            }
        for(int i=1;i<nums.length;i++){
           
        if(nums[i-1]+1==nums[i]){
          sum++;
        }
        else if(nums[i-1]==nums[i]){
            continue;
        }
        else{
            if(maxi<sum)
            maxi=sum;
            sum=1;
        }
        }
        return Math.max(maxi,sum);
    }
}
