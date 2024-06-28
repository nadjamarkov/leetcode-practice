class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int prefix[] = new int[len];
        int suffix[] = new int[len];
        int product[] = new int[len];

        // set everything to 1 initially
        for(int i = 0; i < len; i++){
            prefix[i] = 1;
            suffix[i] = 1;
        }

        // change the values of the prefixes and suffixes by multiplying
        for(int i = 1; i < len; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = len-2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // multiply them out
        for(int i = 0; i < len; i++){
            product[i] = prefix[i] * suffix[i];
        }

        return product;
    }
}
