package codingProbs;

public class SmallestNumber {
    /*
     * public static int FindMin(int a[])
     * Returns the smallest number in array that has been rotated
     * For example - Array {3,4,5,6,1,2} returns 1
     */

    public static int FindMin(int a[])
    {
        /*
         ** Your code goes here
         */
        if(a.length==1){
            return a[0];
        }
        int len=a.length;
        while(len>1){
            if(a[len-1] < a[len-2]){
                return a[len-1];
            }
            len--;
        }
        return a[0];
    }

    public static void main(String args[])
    {
        boolean result = true;
        result = result && FindMin(new int[]{1,2,3,4}) == 1;
        result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
        result = result && FindMin(new int[]{2,1}) == 1;
        result = result && FindMin(new int[]{1}) == 1;

        try {
            FindMin(null);
            result = false;
        }
        catch(Exception e)
        {
            result = result && true;
        }

        if(result)
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("There are test failures");
        }
    }
}
