import java.util.Arrays;

public class Question76 {
    static void transpose(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[][] transposeArr = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposeArr[j][i] = arr[i][j];
            }
        }

        for(int[] x: transposeArr){
            System.out.println(Arrays.toString(x));
        }
    }

    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        transpose(mat1);
    }
}