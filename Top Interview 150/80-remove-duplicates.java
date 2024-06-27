class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k = 0;

        int reps = 1;
        int index = 1;
        for(int i = 1; i<len; i++){
            if(nums[i]==nums[i-1]){
                reps++;
            }
            else{
                reps = 1;
            }
            if(reps<=2){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
