// Find the smallest positive integer value that cannot be represented as sum of any subset of a given array

public class Subset {

    public static int solution(int[] arr){
        int res = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > res){
                return res;
            }else{
                res = res+arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 10, 11, 15};
        System.out.println(solution(arr));
    }
}
