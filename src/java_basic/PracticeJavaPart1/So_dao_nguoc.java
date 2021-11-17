package java_basic.PracticeJavaPart1;

public class So_dao_nguoc{
    public static Boolean checkNumber(int number){
        int IntergerReplace = number;
        int result = 0;
        while (IntergerReplace > 0){
            result = result * 10 + IntergerReplace % 10;
            IntergerReplace /= 10;
        }
        if(result == number){
            return  true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 999999; ++i) {
            if(checkNumber(i) == true){
                System.out.println(i);
            }
        }
    }

}
