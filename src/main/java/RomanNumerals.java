public class RomanNumerals {
    private int number;
    private String output;
    private static final int[] VALUE = {1,5,10,50,100,500,1000};
    private static final String[] ROMAN = {"I","V","X","L","C","D","M"};

    public RomanNumerals(){
        output = "";
    }

    public void setNumber(int i){
        number = i;
    }

    public String getNumber(){
        return output;
    }

    private boolean nearNextDigit(int i){
        if (number >= (VALUE[i+1] - VALUE[i])){
            number += VALUE[i];
            output += ROMAN[i];
            return true;
        }
        return false;
    }

    public void convert(){
        int i;
        do{
            if(number >= VALUE[6]){
                i = 6;
                output += convert(i);
            }
            else if(number >= VALUE[5]){
                i = 5;
                output += convert(i);
            }
            else if(number >= VALUE[4]){
                i = 4;
                output += convert(i);
            }
            else if(number >= VALUE[3]){
                i = 3;
                output += convert(i);
            }
            else if(number >= VALUE[2]){
                i = 2;
                output += convert(i);
            }
            else if(number >= VALUE[1]){
                i = 1;
                output += convert(i);
            }
            else if(number >= VALUE[0]){
                i = 0;
                boolean nearDigit = nearNextDigit(i);
                if(!nearDigit){
                    output += convert(i);
                }
            }
        }while(number > 0);
    }

    private String convert(int i){
        number = number - VALUE[i];
        return ROMAN[i];
    }

}
