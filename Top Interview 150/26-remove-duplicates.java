class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int repeats = 0;

        for(int i = 0; i<len-1; i++){
            for(int j = i+1; j<len; j++){
                if(nums[i]==nums[j]){
                    nums[i] = 99999;
                    repeats++;
                }
            }
        }

        for(int i = 0; i<len; i++){
            for(int j = i; j<len; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return len-repeats;
    }
}
