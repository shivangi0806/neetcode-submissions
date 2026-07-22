class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0;
        int rightEnd=heights.length-1;
        int leftEnd=0;
        int minbar=0;
       int widht=0;
       int height=0;
        int area=0;
        while(leftEnd<rightEnd){
           minbar=Math.min(heights[leftEnd],heights[rightEnd]);
           int width= rightEnd-leftEnd;
           area=minbar*width;
           if(heights[rightEnd]<heights[leftEnd]){
              rightEnd--;
           }else{
             leftEnd++;
           } 
           if(area>maxarea){
            maxarea=area;
           }
        }
        return maxarea;
    }
}
