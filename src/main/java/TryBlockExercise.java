public class TryBlockExercise {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new ResourceNotFoundException("Resource Not Error found");
        }
        catch (ResourceNotFoundException ex){
            System.out.println("Inside catch block");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}

class ResourceNotFoundException extends Exception{
    ResourceNotFoundException(String message){
        super(message);
    }
}