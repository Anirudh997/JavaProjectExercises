package Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
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
        /*
        int[] nums ={1,2,4,5};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        System.out.println(list);
        list.contains(list.get(0)+1);

         */
    }
}
