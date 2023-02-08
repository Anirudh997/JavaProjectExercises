package multipleInterfaceExercise;

public class body implements Animal,Human{

    @Override
    public void heart() {
        Human.super.heart();
        Animal.super.heart();
    }

    @Override
    public void kidney() {

    }
}
