public class MultipleInterfaceInterviewQuestion implements I2,I1{

    //When both have same methods.. first one will be implemented
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        System.out.println("SUM");
    }
}

interface I1{
    static void sum(){}
}

interface I2{
    static void sum(){}
}