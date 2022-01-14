public class RomanNumerals {
    private int number;
    private String output;
    private int j;
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
        do{
            if(number >= VALUE[6]){
                j = 6;
                output += convertM(number);
            }
            else if(number >= VALUE[5]){
                j = 5;
                output += convertD(number);
            }
            else if(number >= VALUE[4]){
                j = 4;
                output += convertC(number);
            }
            else if(number >= VALUE[3]){
                j = 3;
                output += convertL(number);
            }
            else if(number >= VALUE[2]){
                j = 2;
                output += convertX(number);
            }
            else if(number >= VALUE[1]){
                j = 1;
                output += convertV(number);
            }
            else if(number >= VALUE[0]){
                j = 0;
                boolean nearDigit = nearNextDigit(j);
                if(!nearDigit){
                    output += convertI(number);
                }
            }
        }while(number > 0);
    }

    private String convertI(int i){//1
        number = number - VALUE[0];
        return ROMAN[0];
    }

    private String convertV(int i){//5
        number = number - VALUE[1];
        return ROMAN[1];
    }

    private String convertX(int i){//10
        number = number - VALUE[2];
        return ROMAN[2];
    }

    private String convertL(int i){//50
        number = number - VALUE[3];
        return ROMAN[3];
    }

    private String convertC(int i){//100
        number = number - VALUE[4];
        return ROMAN[4];
    }

    private String convertD(int i){//500
        number = number - VALUE[5];
        return ROMAN[5];
    }

    private String convertM(int i){//1000
        number = number - VALUE[6];
        return ROMAN[6];
    }
}
