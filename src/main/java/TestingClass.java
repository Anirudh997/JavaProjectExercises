import java.util.HashMap;

public class TestingClass {
    static class Helper{
        private int data = 5;
        public void bump(int inc){
            inc++;
            data = data + inc;
        }
    }

    static int[] nums;

    public static void main(String[] args) {
        /*

        int x=0;
        if(x>0)
            System.out.println("0");
            System.out.println("1");

        int[] nums = {1,2,3,4};
        Helper h = new Helper();
        int data =2;
        h.bump(data);
        System.out.println(h.data + " " + data);

        int i=0,j=0;
        int counter=0;
        outer:
        for(i=0;i<4;i++){
            for(j=0;j<2;j++){
                counter++;
                if(i==2)
                    i++;
                continue outer;
            }
        }
        System.out.println("i="+i+",counter="+counter);


        Long i=new Long(10);
        Long j=10;
        if(i.equals(j))
            System.out.println("Eq");
        else
            System.out.println("NotEqual");



        int x=5,y=0;
        try{
            try{
                System.out.println(x);
                System.out.println(x/y);
                System.out.println(y);
            }
            catch (ArithmeticException ex){
                System.out.println("InnerCatch1");
                throw  ex;
            }
            catch (RuntimeException ex){
                System.out.println("Inner Catch2");
                throw ex;
            }
            finally {
                System.out.println("Inner Finally");
            }
        }
        catch (Exception ex){
            System.out.println("Outer Catch");
        }

         */

        /*
        int x=0,y=4,z=5;
        if(x>0)
            if(y<3)
                System.out.println("One");
            else if(y<4)
                System.out.println("Two");
            else if(z>5)
                System.out.println("Three");
        else
            System.out.println("Four");

         */

        /*Object obj = new Object();
        System.out.println(obj);*/
/*

        int a=5;
        a+=5;
        switch (a){
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
            default:
                System.out.println("0");
        }
*/
/*
        String[] comp = {"RAM","HDD","MOUSE"};
        String[] parts = {comp[0],comp[2]};
        System.out.println(parts[1]);

        //System.out.println(nums.length);
        int[] balls ={};
        System.out.println(balls.length);*/

        //System.out.println(Math.copySign(100.6,-200.6));

        HashMap<String,String> map = new HashMap<>();

        map.put("potti","Kittu");
        map.put("potti","Mintu");
        System.out.println(map);
    }
}
