

public class MethodOverloadingInterviewQuestion {
    public static void main(String[] args) throws Exception {
        Student obj = new Student();
        System.out.println(obj.marks(35));
        obj.marks(34,5);
        System.out.println(obj.marks(34));
        obj.marks('s');

    }
    //u can overload only no of params and type of params but not return type
    static class Student{
        int marks(int m1){
            return m1;
        }
        void marks(char m1){
            System.out.println(m1);
        }
        void marks(int m1,int m2){
            System.out.println(m1 + m2);
        }
    }
}
