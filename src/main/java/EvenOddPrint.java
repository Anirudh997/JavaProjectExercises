public class EvenOddPrint {
    public static void main(String[] args) {
        //To print all values from 1 to 10
        int val=10;
        EvenOdd evenOdd = new EvenOdd(val);
        Thread t1 = new Thread(()->evenOdd.evenPrint());
        Thread t2 = new Thread(()->evenOdd.oddPrint());

        t1.start();
        t2.start();
    }

    static class EvenOdd{

        int count=1;
        int num;

        public EvenOdd(int num){
            this.num=num;
        }

        public synchronized void oddPrint(){
            while(count<num){
                if(count%2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " value is " + count);
                count++;
                notify();
            }
        }

        public synchronized void evenPrint(){
            while(count<num){
                if(count%2!=0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " value is " + count);
                count++;
                notify();
            }
        }

    }
}