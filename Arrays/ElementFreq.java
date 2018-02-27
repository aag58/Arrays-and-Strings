package Arrays;

import java.util.HashMap;

public class ElementFreq {
    public static void solution(int[] arr, int k){
        HashMap hm = new HashMap();
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(hm.containsKey(arr[i])){
                count = (int)hm.get(arr[i]);
                hm.put(arr[i], ++count);
                if(count> arr.length/k){
                    System.out.println(arr[i]);;
                }
            }else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
//        int[] arr = {1,2,3,4,5};
        solution(arr, 4);
//            int temp = 0;
//        for (int i = 0; i < arr.length/2  ; i++) {
//             temp = arr[i];
//             arr[i] = arr[arr.length-i-1];
//             arr[arr.length-i-1] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
    }
}
