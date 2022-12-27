import java.util.Arrays;

public class Question11 {

    static int[][] transpose(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[][] transposeArr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposeArr[j][i] = arr[i][j];
            }
        }

        for(int[] x: arr){
            System.out.println(Arrays.toString(x));
        }

        System.out.println();
        return transposeArr;
    }

    static void rotateLeft(int[][] arr){
        int[][] transposeArr = transpose(arr);
        int i=0, j=transposeArr.length-1;
        int[] temp = new int[transposeArr[0].length];

        while(i<j){
            temp = transposeArr[i];
            transposeArr[i] = transposeArr[j];
            transposeArr[j] = temp;
            i++;
            j--;
        }

        for(int[] line: transposeArr){
            System.out.println(Arrays.toString(line));
        }
    }

    public static void main(String[] args) {
        int row = 3, col = 3, val = 1;
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = val++;
            }
        }

        rotateLeft(arr);
    }
}