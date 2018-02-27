package Arrays;

public class Kadane {

    public static int subarray(int[] arr){
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int[] arr = {2,3,-2,4};
        System.out.println(subarray(arr));


    }
}
