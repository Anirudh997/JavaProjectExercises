package multipleInterfaceExercise;

public interface Human {
    default void heart(){
        System.out.println("Pumping human");
    }
    static void lungs(){
        System.out.println("Breathing human");
    }
    void kidney();
}
