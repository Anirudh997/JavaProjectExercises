public class TryBlockInterviewQuestion {
    public static void main(String[] args) {
        int a = sum();
        System.out.println(a);
        System.out.println(diff());
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
        //return 5; //--3rd
    }

    //If try and finally bth have return stmt.. finally return will be returned
    public static int diff(){
        try {
            int g=1;
            System.out.println("in Try block");
            System.out.println(g);
            return 10;
        }
        finally {
            return 1000; //--1st
        }
    }
}
