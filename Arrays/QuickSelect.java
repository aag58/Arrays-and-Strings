package Arrays;

public class QuickSelect {
    public static int partition(int[] arr, int p, int r){
        int i = p-1;
        int j = p;
        int temp = 0;
        while(j<r){
            if(arr[j]<arr[r]){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }

    public static int quickselect(int[] arr, int n){
        int q = partition(arr, 0, arr.length-1);
        while(q!= n){
            if(q<n){
                q = partition(arr, q+1, arr.length-1);
            }else{
                q = partition(arr, 0, q-1);
            }
        }
        return arr[q-1];
    }

    public static void main(String[] args) {
        int[] arr = {20,30,100,60,50};
        System.out.println(quickselect(arr, 1));
        System.out.println(quickselect(arr, 2));
        System.out.println(quickselect(arr, 3));
        System.out.println(quickselect(arr, 4));
    }
}
