import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,5,6,7,8};

//        HashSet hs = new HashSet();
//        for(int i: arr){
//            hs.add(i);
//        }
//        int[] arr2 = new int[hs.size()];
//        int i=0;
//        Iterator it = hs.iterator();
//        while(it.hasNext()){
//            arr2[i] = (Integer)it.next();
//            i++;
//
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] == arr[i+1]){
                arr[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
