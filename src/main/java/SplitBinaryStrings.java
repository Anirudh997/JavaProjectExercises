public class SplitBinaryStrings {
    public static void main(String[] args) {
        String s = "101011000101";
        int x=0,y=0,c=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                x++;
            }else{
                y++;
            }
            if(x==y){
                c++;
            }
        }

        if(x!=y){
            System.out.println("false");
        }
        System.out.println("No of pairs are : " + c);
    }
}
