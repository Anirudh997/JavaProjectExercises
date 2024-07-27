package codingProbs;

public class  StringReverse {
    public static String reverseStr( String str ){
        //your code goes here
        char[] charArray = str.toCharArray();

        // Use two pointers to swap characters in the array
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }


        return String.valueOf(charArray);
    };


    public static void main(String[] args){

        String testString;
        String solution;
        boolean result = true;

        result = result && reverseStr("abcd").equals("dcba");

        if(result){
            System.out.println("All tests pass");
        }
        else{
            System.out.println("There are test failures");
        }

    }
}
