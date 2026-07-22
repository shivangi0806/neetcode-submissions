class Solution {
    public int trap(int[] height) {
        int rightmax[] = new int[height.length];
        int leftmax[] = new int[height.length];
        rightmax[0]=height[0];
        leftmax[height.length-1]=height[height.length-1];
        int waterlevel=0;
        int maxarr=0;int actualwater=0;
        //base cases
        //end right 
        if (height == null || height.length < 3) {
    return 0;
}
        //end left
        //singlr bar
        //right
        for(int i=1;i<height.length;i++){
            if(rightmax[i-1]<height[i]){
                rightmax[i]=height[i];
            }else{
                rightmax[i]=rightmax[i-1];
            }
        }
        //left
        for(int i=height.length-2;i>=0;i--){
            if(height[i]>leftmax[i+1]){
                leftmax[i]=height[i];
            }else{
                leftmax[i]=leftmax[i+1];
            }
        }
        //total
        for(int i=0;i<height.length;i++){
            maxarr=Math.min(rightmax[i],leftmax[i]);
            waterlevel= maxarr-height[i];
            if(waterlevel>0){
            actualwater+=waterlevel;}
        }
        //return
        return actualwater;
    }
}
