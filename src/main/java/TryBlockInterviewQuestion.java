public class TryBlockInterviewQuestion {
    public static void main(String[] args) {
        int a = sum();
        System.out.println(a);
    }
// Case where what is returned while accessing all try, catch, finally
    public static int sum(){
        try{
            int b = 1/0;
            System.out.println("in try");
            System.out.println(b);
            return 1;
        }
        catch(Exception e){
            System.out.println("in catch");
            return 2; //--2nd
        }
        finally{
            System.out.println("in finally");
            //return 3; //-- 1st
        }
    }
}
