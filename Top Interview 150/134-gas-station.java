class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int starting_station = 0;
        int current_station = 0;
        int total_cost = 0;
        int num_stations = gas.length;
        int complete_cost = 0;
        int complete_gas = 0;

        for(int i = 0; i<num_stations; i++){
            complete_cost += cost[i];
            complete_gas += gas[i];
        }
        if(complete_cost>complete_gas) return -1;

        while(current_station < num_stations){
            total_cost = total_cost + gas[current_station] - cost[current_station];
            if(total_cost<0){
                starting_station = current_station + 1;
                total_cost = 0;
            }
            current_station++;
        }
        
        return starting_station;
    }
}
