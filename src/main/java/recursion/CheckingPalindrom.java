package recursion;

public class CheckingPalindrom {
    public static void main(String[] args) {

        String code = "madam";

        if(palinCheck(code,0)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean palinCheck(String code, int i) {

        if(code.charAt(i) != code.charAt(code.length()-i-1)){
            return false;
        }
        if(i>=code.length()/2){
            return true;
        }
        return palinCheck(code,i+1);
    }
}
