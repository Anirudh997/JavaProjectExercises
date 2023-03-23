package leetcode;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        int[] temp = new int[arr.length];

        System.out.println(mergeSort(arr,temp,0,arr.length-1));
    }

    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid, inv_count=0;
        if(right>left){
            mid=(right+left)/2;
            inv_count += mergeSort(arr, temp, left, mid);
            inv_count += mergeSort(arr, temp, mid+1, right);

            inv_count += merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        int inv_count=0;
        while (i<mid && j<=right){
            if(arr[i]<arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++]=arr[j++];
                inv_count += (mid-i);
            }
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<right){
            temp[k++]=arr[i++];
        }

        for(i=left;i<=right;i++){
            arr[i]=temp[i];
        }
        return  inv_count;
    }
}
