class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasLeft=0;
        int start=0;
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            gasLeft+=gas[i]-cost[i];
            if(gasLeft<0){
                gasLeft=0;
                start=i+1;
            }
        }
        if(totalgas>=totalcost){
            return start;
        }
        return -1;
    }
}
