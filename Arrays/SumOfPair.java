package Arrays;

import java.util.HashSet;

public class SumOfPair {

    public static void PrintPair(int[] arr, int sum){
        int target = 0;
        HashSet hs = new HashSet(arr.length);
        for(int i: arr){
            target = sum - i;
            if(!hs.contains(target)){
                hs.add(i);
//                System.out.println(hs);
            }else{
                System.out.println(i+","+target);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,4,5,6};
        PrintPair(arr, 9);
    }
}
