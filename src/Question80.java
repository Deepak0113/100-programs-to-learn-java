//80.Java Program to determine whether a given matrix is a sparse matrix

public class Question80 {
    static boolean isSparseMatrix(int[][] mat){
        int row = mat.length, col = mat[0].length;
        int count = 0;

        for(int[] arr: mat){
            for(int item: arr){
                if(item == 0) count++;
            }
        }

        return count > (row*col)/2;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {4, 0, 10},
                {0, 5, 0},
                {0, 0, 6}
        };

        System.out.print(isSparseMatrix(mat));
    }
}