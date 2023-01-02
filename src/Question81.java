//81.Java Program to determine whether two matrices are equal

import java.util.Arrays;

public class Question81 {
    static boolean isEqualMatrix(int[][] mat1, int[][] mat2){
        int row1 = mat1.length, col1 = mat1[0].length;
        int row2 = mat2.length, col2 = mat2[0].length;

        if(row1 != row2) return false;
        if(col1 != col2) return false;

        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }

        return true;
    }

    static boolean isEqualMatrixAlt(int[][] mat1, int[][] mat2){
        int row1 = mat1.length, col1 = mat1[0].length;
        int row2 = mat2.length, col2 = mat2[0].length;

        if(row1 != row2) return false;
        if(col1 != col2) return false;

        for(int i=0; i<row1; i++){
            if(!Arrays.equals(mat1[0],mat2[0])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int[][] mat2 = new int[][]{
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        System.out.println(isEqualMatrix(mat1,mat2));
        System.out.println(isEqualMatrixAlt(mat1,mat2));
    }
}