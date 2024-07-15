class Solution {
    public String intToRoman(int num) {
        int tens = 1;
        String roman = "";
        while(num > 0){
            int cipher = num % 10;
            roman = number_value(cipher, tens) + roman; 
            tens = tens * 10;
            num = num / 10;
        }
        return roman;
    }

    private String number_value(int num, int tens){
        String roman = "";
        if(num == 1) roman = "I";
        else if(num == 2) roman = "II";
        else if(num == 3) roman = "III";
        else if(num == 4) roman = "IV";
        else if(num == 5) roman = "V";
        else if(num == 6) roman = "VI";
        else if(num == 7) roman = "VII";
        else if(num == 8) roman = "VIII";
        else if(num == 9) roman = "IX";

        if(tens == 10){
            if(num == 9){
                roman = "XC";
            }
            else{
                roman = roman.replace('I','X');
                roman = roman.replace('V','L');
            }
        }
        else if(tens == 100){
            if(num == 9){
                roman = "CM";
            }
            else{
                roman = roman.replace("I","C");
                roman = roman.replace("V","D");
            }
        }
        else if(tens == 1000){
            roman = roman.replace("I","M");
        }

        return roman;
    }
}
