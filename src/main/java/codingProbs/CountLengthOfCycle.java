package codingProbs;

public class CountLengthOfCycle {
    /**
     *
     * You have an integer array.
     * Starting from arr[startIndex], follow each element to the index it points to.
     * Continue to do this until you find a cycle.
     * Return the length of the cycle. If no cycle is found return -1
     *
     */
    public static int countLengthOfCycle( int[] arr, int startIndex ) {
        //your code goes here
        if(arr.length==1){
            return -1;
        }

        int i=startIndex+1;
        int len=1;
        while(i!=startIndex){
            if(i==arr.length){
                i=0;
                continue;
            }
            if(i==arr.length-1 || i == startIndex-1 && (arr[startIndex]==arr[i]+1)){
                return len;
            }
            if(arr[i] == arr[i-1]+1){
                len++;
                i++;
            }
        }
        System.out.println(len);

        return len;
    }


    public static void main( String[] args ) {

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;

        if(testsPassed) {
            System.out.println( "Test passed." );
            //return true;
        } else {
            System.out.println( "Test failed." );
            //return false;
        }


    }
}
