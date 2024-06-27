class Solution {
    public void rotate(int[] nums, int k) {
        while(nums.length<=k){
            k = k - nums.length;
        }  
        int[] numsCopy = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            numsCopy[i] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            int newIndex = i + k;
            if(newIndex>=nums.length){
                newIndex = newIndex - nums.length;
            }
            numsCopy[newIndex] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = numsCopy[i];
        }
    }
}
