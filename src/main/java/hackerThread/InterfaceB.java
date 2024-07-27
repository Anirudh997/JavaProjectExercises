package hackerThread;

public interface InterfaceB {

    void show();

    default void message(){
        System.out.println("World");
    }
}
