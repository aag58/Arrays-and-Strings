import java.util.Arrays;

public class SingleElementInArrayWithDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,2,3,4,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i=i+2) {
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
