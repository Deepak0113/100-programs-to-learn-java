//74.Java Program to find the product of two matrices

public class Question74 {
    static int[][] productMatix(int[][] mat1, int[][] mat2){
        int row1 = mat1.length, col1 = mat1[0].length;
        int row2 = mat2.length, col2 = mat2[0].length;
        int[][] prodMat = new int[row1][col2];

        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<row2; k++){
                    prodMat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return prodMat;
    }

    static void displayMatrix(int[][] mat){
        for(int[] arr: mat){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int mat2[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };

        displayMatrix(mat1);
        displayMatrix(mat2);
        displayMatrix(productMatix(mat1,mat2));
    }
}