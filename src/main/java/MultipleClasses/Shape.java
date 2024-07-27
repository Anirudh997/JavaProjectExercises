package MultipleClasses;

public class Shape {
    public static void main(String[] args) {
        Shape shape = new Quad();

        Quad quad = new Quad();

        //Runtime Exception
        Triangle tri = (Triangle) shape;
        System.out.println("present");
    }
}
