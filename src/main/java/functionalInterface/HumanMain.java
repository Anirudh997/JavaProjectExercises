package functionalInterface;

public class HumanMain {

    public static void main(String[] args) {
        Human h = new Human(() -> System.out.println("hello"));
    }

}
