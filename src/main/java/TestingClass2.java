public class TestingClass2 extends Test{

    public static void main (String args[])
    {
        Test.TestMethod();
        System.out.println(Test.i);
        TestingClass2 t = new TestingClass2();

        //Compile error
       /* for(int i=0; 0; i++)
        {
            System.out.println("Hello Java");
        }*/

        System.out.println(10 * 20 + "Java");
        System.out.println("Java" + 10 * 20);
    }
}

abstract class Test{
    static int i = 102;
    static void TestMethod()
    {
        System.out.println("hi !! I am good !!");
    }
}
