class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : hand) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
if (hand.length % groupSize != 0) {
    return false;
}
for(int i : hand){

            if (map.get(i) == 0) {
                continue;
            }

for (int j = 0; j < groupSize; j++){
 int card = i + j;

                if (map.getOrDefault(card, 0) == 0) {
                    return false;
                }

                // Consume the card
                map.put(card, map.get(card) - 1);
}} return true;
        //  int place =groupSize;
        // int arr[] = arr[place];
       
        // for(int i=1;i<hand.length-1;i++){
        //     if(hand[i+1]==hand[i]+1){
        //         if(arr.length==groupSize){
                
        //         }
        //     }
        // }
    }
}
