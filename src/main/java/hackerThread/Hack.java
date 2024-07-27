package hackerThread;

public class Hack extends Thread{
    Thread threadToInterrupt;

    public void run(){
        threadToInterrupt.interrupt();
    }
}
