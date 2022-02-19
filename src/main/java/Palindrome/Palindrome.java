package Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = String.valueOf(sc.nextLine());
        String rstr="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            rstr = c + rstr;
        }
        if(str.equals(rstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
