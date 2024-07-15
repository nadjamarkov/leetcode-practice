class Solution {
    public String reverseWords(String s) {
        String words = "";
        String word = "";
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' ') word = s.charAt(i) + word;
            if(s.charAt(i) == ' ' || i == 0){
                if(word!="") words = words + word + " ";
                word = "";
            }
        }
        words = words.substring(0, words.length() - 1);
        return words;
    }
}
