class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int k = 0;

        // push the vals to the end
        for(int i = len-1; i>0; i--){
            if(nums[i]!=val){
                System.out.println(nums[i]);
                for(int j = i-1; j>=0; j--){
                    if(nums[j]==val){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }

        // count all nums which are not equal to val
        for(int i = 0; i < len; i++){
            if(nums[i]!=val) k++;
            else break;
        }

        return k;
    }
}
