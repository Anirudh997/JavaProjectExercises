public class Swapping {
    public static void main(String[] args){
        int m1 =2;
        int m2 =4;
        System.out.println("Values before swapping m1 is " + m1 + " m2 is " + m2);
        swap(m1,m2);
    }

    static void swap(int m1, int m2){
        int temp = m1;
        m1=m2;
        m2=temp;
        System.out.println("Values after swapping m1 is " + m1 + " m2 is " + m2);
    }
}
