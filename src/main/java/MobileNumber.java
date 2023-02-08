public class MobileNumber {
    public static void main(String[] args) {
        System.out.println(convertSentence("codingninjas"));
    }

    public static String convertSentence(String str)
    {
        //    Write your code here.
        String[] arr ={"abc", "def" ,"ghi" ,"jkl" ,"mno","pqrs","tuv","wxyz"};
        String[] sarr = str.split("");

        StringBuilder sb = new StringBuilder();
        for(String s : sarr){
            for(Integer i=0;i<arr.length;i++){
                String a = arr[i];
                if(arr[i].contains(s)){
                    i+=2;
                    for(int j=0;j<=a.lastIndexOf(s);j++){
                        sb.append(i.toString());
                    }
                }
            }
        }

        return sb.toString();
    }
}
