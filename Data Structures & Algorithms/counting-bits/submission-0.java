class Solution {
    public int[] countBits(int n) {int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){int j=0;int c=0;
         while(j<32){
            int ans = i & (1<<j);
            if(ans!=0){
              c++;
            }
            j++;
         } 
         arr[i]=c;
        }
        return arr;
    }
}
