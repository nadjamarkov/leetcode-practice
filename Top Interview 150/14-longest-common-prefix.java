class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        boolean similar = true;
        int prefix_length = 0;
        String prefix = "";
        String minimum = strs[0];

        for(int i=0; i<length; i++){
            if(strs[i].compareTo(minimum)<0) minimum = strs[i];
        }
        int min_length = minimum.length();

        while(similar == true && prefix_length < min_length){
            for(int j = 0; j < length-1; j++){
                if(strs[j].charAt(prefix_length)!=strs[j+1].charAt(prefix_length)){
                    similar = false;
                    break;
                }
            }
            if(similar) prefix+=strs[0].charAt(prefix_length);
            prefix_length++;
        }
        return prefix;
    }
}
