class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int length = m + 1;
        for(int i = 0; i<n; i++){
            int newIndex = binarySearch(nums1, nums2[i], length);
            
            // shift elements by 1
            for(int j = m+n-1; j>newIndex; j--){
                int temp = nums1[j-1];
                nums1[j] = temp;
            }

            nums1[newIndex] = nums2[i];
            length = length + 1;
        }
    }
    
    // function returns the index where the element should be placed
    public int binarySearch(int[] array, int value, int length){
        
        int low = 0;
        int high = length-1;
        int middle;

        while(low<=high){
            middle = (low+high)/2;
            if(array[middle]>value){
                high = middle - 1;
            }
            else if(array[middle]<value){
                low = middle + 1;
            }
            else return middle;
        }

        // in the case where middle doesn't return anything
        if(low>=length) low = length-1;
        return low;
    }
}
