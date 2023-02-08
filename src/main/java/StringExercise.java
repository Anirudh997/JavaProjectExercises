import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExercise {
    public static void main(String[] args) {
        String s="woW";
        String result ="";
        //reversing a string
        for(int i = s.length()-1;i>=0;i--){
            result = result + s.charAt(i);
        }
        System.out.println(result);

        //Palindrome
        if(result.equalsIgnoreCase(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

        //String Builder
        StringBuilder s1 = new StringBuilder();
        s1.append("abced");
        System.out.println(s1);

        //Converting data types
        double d = 13.89;
        int a = (int) d;
        long l1 = a;
        //System.out.println(a);

        float f = 13.56f;
        double d1 = f;
        long l = (long) f;
        //System.out.println(l);

        //integer to char
        char c = '5';
        //System.out.println(c);

        int m = 5;
        String s2 = Integer.toString(m);
        //System.out.println(s2+"4");

        String a1 = "hello";
        String a2 = "hello";
        if(a1==a2){
            System.out.println("True by ==");
        } if(a1.equals(a2)){
            System.out.println("True by equals");
        } else System.out.println("false by ==");
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        String a3 = new String("Hellow");
        String a4 = new String("Hellow");
        if(a4.equals(a3)){
            System.out.println("True by equals");
        }if(a4==a3){
            System.out.println("True by ==");
        }
        System.out.println(a3.hashCode());
        System.out.println(a4.hashCode());

        System.out.println(100 + 100 + "Hello");
        System.out.println("Hello" + 100 + 100);

        //reversing a string
        String str = "hellow";
        String[] split = str.split("");
        //Arrays.stream(split).forEach(System.out::println);

        //String builder
        StringBuilder sb = new StringBuilder(str);
        String s3 = sb.reverse().toString();
        System.out.println(s3);

        char[] chars = str.toCharArray();
        List<Character> letters = new ArrayList<>();
        for(int i =0; i<chars.length;i++){
            letters.add(chars[i]);
        }

        //String s4 = str.chars().mapToObj(c -> (char) c).reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1).toString();
        //System.out.println(s4);

    }
}
