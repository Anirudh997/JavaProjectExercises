package hackerThread;

public interface InterfaceA extends InterfaceB {

    void tell();

    default void message(){
        System.out.println("HI");
    }
}
