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

    public void convert(){
        do{
            if(number >= VALUE[6]){
                output += convertM(number);
            }
            else if(number >= VALUE[5]){
                output += convertD(number);
            }
            else if(number >= VALUE[4]){
                output += convertC(number);
            }
            else if(number >= VALUE[3]){
                output += convertL(number);
            }
            else if(number >= VALUE[2]){
                output += convertX(number);
            }
            else if(number >= VALUE[1]){
                output += convertV(number);
                //number -= VALUE[1];
            }
            else if(number >= VALUE[0]){
                if (number >= (VALUE[1] - VALUE[0])){
                    number += VALUE[0];
                    output += ROMAN[0];
                }else{
                    output += convertI(number);
                    //number -= VALUE[0];
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
