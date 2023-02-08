package recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        //Input Number which name printed times
        int count = 5;

        printNum(1,count);
    }

    private static void printNum(int i, int count) {
        //base
        if(i>count){
            return;
        }
        System.out.println("Luffy");
        printNum(i+1,count);
    }
}
