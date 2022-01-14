public class RomanNumerals {
    private int number;
    private String output;
    private static final int IVALUE = 1;
    private static final int VVALUE = 5;
    private static final int XVALUE = 10;
    private static final int LVALUE = 50;
    private static final int CVALUE = 100;
    private static final int DVALUE = 500;
    private static final int MVALUE = 1000;
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
        while(number >= MVALUE){
            output += convertM(number);
        }
        while(number >= DVALUE){
            output += convertD(number);
        }
        while(number >= CVALUE){
            output += convertC(number);
        }
        while(number >= LVALUE){
            output += convertL(number);
        }
        while(number >= XVALUE){
            output += convertX(number);
        }
        while(number >= VVALUE){
            output += convertV(number);
        }
        while(number >= IVALUE){
            output += convertI(number);
        }
    }

    private String convertI(int i){//1
        number = number - IVALUE;
        return "I";
    }

    private String convertV(int i){//5
        number = number - VVALUE;
        return "V";
    }

    private String convertX(int i){//10
        number = number - XVALUE;
        return "X";
    }

    private String convertL(int i){//50
        number = number - LVALUE;
        return "L";
    }

    private String convertC(int i){//100
        number = number - CVALUE;
        return "C";
    }

    private String convertD(int i){//500
        number = number - DVALUE;
        return "D";
    }

    private String convertM(int i){//1000
        number = number - MVALUE;
        return "M";
    }
}
