class Solution {
    public int candy(int[] ratings) {
        int num_children = ratings.length;
        int[] candies = new int[num_children];

        /*initialize to 1 because that is the minimum number of candies the children can get*/
        for(int i = 0; i<num_children; i++){
            candies[i] = 1;
        }

        /*first iteration: if rating larger than the previous child, add one more candy than the previous child*/
        for(int i = 1; i<num_children; i++){
            if(ratings[i]>ratings[i-1]) candies[i] = candies[i-1]+1;
        }

        /*second iteration: if rating larger than the next child and the number of candies is the same, add one more candy than the next child*/
        for(int i = num_children-2; i>=0; i--){
            if(ratings[i]>ratings[i+1]) candies[i] = Math.max(candies[i], candies[i+1]+1);
        }

        /*add up the elements in candies array*/
        int total_candies = 0;
        for(int i = 0; i<num_children; i++){
            total_candies += candies[i];
        }

        return total_candies;
    }
}
