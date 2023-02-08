package recursion;

public class PrintNto1BT {
    public static void main(String[] args) {

        //input number.. to print in desc order N...3,2,1
        //Used BackTracking

        int count =5;

        printNum(1,count);

    }

    private static void printNum(int i, int count) {
        if(i>count){
            return;
        }
        printNum(i+1,count);
        System.out.println(i);
    }
}
