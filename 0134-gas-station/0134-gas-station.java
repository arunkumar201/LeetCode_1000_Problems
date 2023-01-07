class Solution {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        // gas Value should be Greater or equal the cost
        //if Not we Can not the journey
//        We will Move ahead to the next station
        int total_fuel=0;
        int total_cost=0;
        for(int i=0;i<n;i++) {
            total_fuel+=gas[i];
            total_cost+=cost[i];
        }
        if(total_cost>total_fuel) return -1;
        int Curr_Tank=0;
        int rem_fuel=0;
        int start=0;
        for(int i=0;i<n;i++){
               Curr_Tank += gas[i] - cost[i];
               if (Curr_Tank < 0) {
                   Curr_Tank = 0;
                   start = i + 1;
             }
           }
        return start;
    }
}