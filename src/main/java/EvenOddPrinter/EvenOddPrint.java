package EvenOddPrinter;

public class EvenOddPrint {

    int num;
    int count=0;

    public void setNum(int num) {
        this.num = num;
    }

    public EvenOddPrint(int num){
        this.num=num;
    }

    public synchronized void EvenPrint() {
        while (count < num) {
            if (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even number is " + count);
            count++;
            notify();
        }
    }

    public synchronized void OddPrint() {
        while (count < num) {
            if (count % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd number is " + count);
            count++;
            notify();
        }
    }

}
