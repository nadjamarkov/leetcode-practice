class Solution {
    public double averageWaitingTime(int[][] customers) {
        int current_time = 0;
        double waiting_time = 0;
        int customer_number = customers.length;

        for(int i = 0; i < customer_number; i++){
            int arrival_time = customers[i][0];
            int prep_time = customers[i][1];
            current_time = Math.max(current_time, arrival_time);
            waiting_time += current_time + prep_time - arrival_time;
            current_time += prep_time;
        }

        return waiting_time/customer_number;
    }
}
