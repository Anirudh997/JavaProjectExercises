package hackerThread;

public class Hacker {
    public static void main(String[] args) {
        try {
            Hack obj = new Hack();
            obj.threadToInterrupt=Thread.currentThread();
            obj.start();
            obj.join();
        }
        catch (InterruptedException ex){
            System.out.println("Exception has been caught " + ex);
        }
    }
}
