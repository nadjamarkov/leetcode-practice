class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);

        for(int i=0; i<len; i++){
            int valid_citations = len-i;
            if(citations[i]>=valid_citations) return valid_citations;
        }

        return 0;
    }
}
