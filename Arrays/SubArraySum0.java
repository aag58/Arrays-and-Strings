package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArraySum0 {
    public static boolean hasSubArray(int[] arr){
        Set s = new HashSet();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(s.contains(sum)){
                return true;
            }else{
                s.add(sum);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, -1, -2, 5, -4, -1};
        System.out.println(hasSubArray(arr));
    }
}
