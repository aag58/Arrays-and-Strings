package Arrays;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };
        Boolean flag = true;

        for (int i = 0; i < matrix.length-1 ; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]){
                    flag = false;
                    break;
                }
            }
//            System.out.println();

        }

        System.out.println(flag);
    }
}
