class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean nonspace = false;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i)!=' '){
                length++;
                nonspace = true;
            }
            if(s.charAt(i)==' ' && nonspace || i == 0 && nonspace) return length;
        }
        return 0;
    }
}
