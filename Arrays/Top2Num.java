package Arrays;

public class Top2Num {

    public static void top2(int[] arr){
        int top1 ,top2 = 0;

        if(arr[0]>arr[1]){
            top1 = arr[0];
            top2 = arr[1];
        }else{
            top1 = arr[1];
            top2 = arr[0];
        }

        for (int i = 2; i < arr.length ; i++) {
            if(arr[i]>top1){
                top2 = top1;
                top1 = arr[i];

            }
            if(arr[i]>top2 && arr[i]<top1){
                top2 = arr[i];
            }
        }

        System.out.println(top1+","+top2);
    }
    public static void main(String[] args) {
        int[] arr = {-8,-4,-4,3,4,6,22,4,6,3};
        top2(arr);


    }
}
