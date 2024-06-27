class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);

        int counter = 0;
        for(int i = 0; i<len-1; i++){
            if(nums[i]!=nums[i+1]){
                counter = i + 1 - counter;
            }
            if(counter > len/2){
                return nums[i];
            }
        }
        return nums[len-1];
    }
}
