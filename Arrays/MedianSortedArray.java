package Arrays;

import java.util.Arrays;

public class MedianSortedArray {

    public static int median(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        int k = 0;
        for(int i=0; i<arr3.length; i++){
//            System.out.println(i);
            if(j<arr1.length && arr1[j]<arr2[k]){
                arr3[i] = arr1[j];
                j++;
            }else{
                arr3[i] = arr2[k];
                k++;
            }
            System.out.println(Arrays.toString(arr3));
        }

        return (arr3[arr3.length/2] + arr3[arr3.length/2 - 1]) / 2;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(median(arr1, arr2));
//        median(arr1, arr2);

    }
}
