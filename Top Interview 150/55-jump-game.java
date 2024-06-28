class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int furthest_index = nums[0];
        for(int i = 0; i<len; i++){
            if(furthest_index < i) return false;
            if(furthest_index >= len-1) return true;
            int max_jump = nums[i];
            furthest_index = Math.max(furthest_index, i + max_jump);
        }
        return false;
    }
}
