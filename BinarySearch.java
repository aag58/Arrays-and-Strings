import java.lang.reflect.Array;

public class BinarySearch {

    public static int BSearch(int[] arr, int n){
        int l=0; int r = arr.length - 1;
        int m = 0;
        while(l<=r){
            m = (l + r)/2;

            if(arr[m] == n){
                return m;
            }
            if(arr[m]<n){
                l= m+1;
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        System.out.println();
        System.out.println(BSearch(arr,60));
    }
}
