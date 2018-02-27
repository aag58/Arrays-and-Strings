import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElemnt {
    public static int findFirtsRepeatingE(int[] arr){
        Set s = new HashSet();
        int min = -1;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(s.contains(arr[i])){
                min = arr[i];
            }else{
                s.add(arr[i]);
            }
        }
        return min;
    }

    public static int findFirtNonRepeatingE(int[] arr){
        Set s = new HashSet();
        int min = -1;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                min = arr[i];
            }
        }
        return min;
    }

    public static  void main(String args[]){
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        System.out.println(findFirtsRepeatingE(arr));
        System.out.println(findFirtNonRepeatingE(arr));
    }
}
