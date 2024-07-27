import java.util.Arrays;
import java.util.stream.Stream;

public class StringFile {
    public static void main(String[] args) {
        System.out.println("hello");

        String str = "hello";

        //Reversing using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        String s1 = sb.reverse().toString();
        System.out.println(s1);

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Iterate over the character array from both ends and swap characters not using new string
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Convert the reversed character array back to a string
        str = String.valueOf(charArray);
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i= str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder);

        //Streams
        String word = "Anirudh Luffy";
        String reduce = word.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (c1, c2) -> c2 + c1);
        System.out.println(reduce);

        String a=new String("hello");
        String b = new String("hello");
        if(a!=b) System.out.println("False by ==");
        if(a.equals(b)){
            System.out.println("true by equals");
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());
        }
    }
}
