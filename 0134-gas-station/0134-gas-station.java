class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int currentFuel = 0;
    int start = 0;
    int total_gas = 0 ,total_cost = 0;

    for(int i=0;i<gas.length;i++) {
        total_gas = total_gas + gas[i];
        total_cost = total_cost + cost[i];
    }

    if(total_gas < total_cost) {
        return -1;
    }

    for(int i=0;i<gas.length;i++) {
     currentFuel += gas[i]-cost[i]; 
    if(currentFuel < 0) {
        start = i + 1;
        currentFuel = 0;
    }
    }
  return start;
    }
}