public class RomanNumerals {
    private int number;
    private String output;
    private static final int[] VALUE = {1,5,10,50,100,500,1000};
    private static final String[] ROMAN = {"I","V","X","L","C","D","M"};

    public RomanNumerals(){
        output = "";
    }

    // "I" can be subtracted only from "V" and "X"
    // "X" can be subtracted only from "L" and "C"
    // "C" can be subtracted only from "D" and "M"
    private boolean subtractivePrinciple(int i){

        // if i = "V", j = 1 and checking with "I"
        // if i = "X", j = 2 and checking with "I", but not "V"
        // 9 should be "IX", not "VIV"
        int j = 2 - i % 2;
        if (number >= (VALUE[i] - VALUE[i-j])){ //Can subtract from the next two higher "digits"
            number += VALUE[i-j]; //adjust the number to next numerals
            output += ROMAN[i-j]; //output the numerals in front, e.g. 4 will be IV
            return true;
        }
        return false;
    }

    public void convert(){
        int i = ROMAN.length - 1;
        do{
            if (number >= VALUE[i]) {
                number = number - VALUE[i];
                output += ROMAN[i];
            }else if (!subtractivePrinciple(i)){
                i--;
            }
        }while(number > 0);
    }

    public void setNumber(int i){
        number = i;
    }

    public String getOutput(){
        return output;
    }
}
