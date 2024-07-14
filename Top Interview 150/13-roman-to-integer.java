class Solution {
    public int romanToInt(String s) {
        int total_number = 0;
        int iterated_values = 0;
        boolean pair = false;

        if(s.length()==0) return 0;
        if(s.length()==1) return number_value(s.charAt(0));

        for(int i = 0; i<s.length()-1; i++){
            char character = s.charAt(i);
            char next_character = s.charAt(i+1);
            if(character == 'I' && next_character == 'V'){
                total_number+=4;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else if(character == 'I' && next_character == 'X'){
                total_number+=9;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else if(character == 'X' && next_character == 'L'){
                total_number+=40;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else if(character == 'X' && next_character == 'C'){
                total_number+=90;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else if(character == 'C' && next_character == 'D'){
                total_number+=400;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else if(character == 'C' && next_character == 'M'){
                total_number+=900;
                i++;
                pair = true;
                iterated_values+=2;
            }
            else{
                pair = false;
                total_number+=number_value(character);
                iterated_values+=1;
            }
            if(!pair && i+1 == s.length()-1) {
                total_number+=number_value(next_character);
            }
        }

        if(pair && s.length()>iterated_values){
            total_number+=number_value(s.charAt(s.length()-1));
        }

        return total_number;
    }

    private int number_value(char character){
        int number = 0;
        if(character == 'I') number=1;
        else if(character == 'V') number=5;
        else if(character == 'X') number=10;
        else if(character == 'L') number=50;
        else if(character == 'C') number=100;
        else if(character == 'D') number=500;
        else if(character == 'M') number=1000;
        return number;
    }
}
