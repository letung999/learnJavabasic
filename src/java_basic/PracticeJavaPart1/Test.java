package java_basic.PracticeJavaPart1;

public class Test {

    public static void findLine(String line){
        String[] lines = line.split(" ");
        for(int i = 0; i <lines.length; ++i){
            if(lines[i].length() == 2){
                System.out.println(lines[i]);
            }
            if(lines[i].length() == 5){
                System.out.println(lines[i]);
            }
            else{
                //donothing
            }
        }
    }
    public static String reserve(String line){
        StringBuilder stringBuilder = new StringBuilder(line);
        String result = stringBuilder.reverse().toString();
        return  result;
    }
    public static void main(String[] args) {
        String line = "hello Nash";
        findLine(line);
        String result = reserve(line);
        System.out.println(result);
    }
}
