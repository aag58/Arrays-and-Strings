import java.util.HashMap;
import java.util.HashSet;

public class ConsecutiveNumInArrays {

    public static int Consecutive(int[] arr){

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            hs.add(arr[i]);
        }
        int size = 1;
        int max_size = 0;
        for (int i = 0; i < arr.length ; i++) {
            int j = arr[i];
            size = 1;
            while(hs.contains(j+1)){
                size++;
                j++;
            }
            if(size> max_size){
                max_size = size;
            }
//            System.out.println(max_size);
        }
        return max_size;
    }
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2,5,11,12,13,14,15,16};

        System.out.println(Consecutive(arr));

//        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
//
//        hm.put(1,2);
//        if(hm.containsKey(1)){
//            hm.put(1,)
//        }

    }
}
