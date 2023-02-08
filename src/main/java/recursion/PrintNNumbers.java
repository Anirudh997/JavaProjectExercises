package recursion;

public class PrintNNumbers {
    public static void main(String[] args) {
        //input number to which numbers to be printed
        int count = 5;
        printNum(1,count);
    }

    private static void printNum(int i, int count) {
        if(i>count){
            return;
        }
        System.out.println(i);
        printNum(i+1,count);
    }
}
