package multipleInterfaceExercise;

public interface Animal {
    default void heart(){
        System.out.println("Pumping animal");
    }
    static void lungs(){
        System.out.println("Breathing animal");
    }

}
