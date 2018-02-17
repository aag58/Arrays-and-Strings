import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    int[] a = {1,3,2,4,6,5,7,8};
    public static int partition(int[] arr, int p, int r){
        int i = p-1;
        int j = p;
        int temp = 0;
        while(j<r){
            if(arr[j]<arr[r]){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }

    public static void quicksort(int arr[], int p , int r){
        int q = 0;
        if(p<r){
            q = partition(arr,p,r);
            quicksort(arr,p,q-1);
            quicksort(arr,q+1,r);

        }
    }
    public static void main(String[] args) {
         int[] arr = {-1,-2,-3,-4};
         quicksort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
