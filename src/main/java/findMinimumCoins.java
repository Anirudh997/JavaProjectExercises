//Greedy Algorithm
public class findMinimumCoins {
    public static void main(String[] args) {
        int amount=70;
        int[] denms = {1,2,5,10,20,50,100,500,1000};
        int len = denms.length;
        //System.out.println(len);
        //System.out.println(denms[8]);
        int count=0;
        while(len>=1){
            if(amount>=denms[len-1]){
                amount = amount - denms[len-1];
                //System.out.println(amount);
                count++;
                continue;
            }
            len--;
        }
        System.out.println(count);
    }
}
