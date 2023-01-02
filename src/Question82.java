//82.Java Program to display the lower triangular matrix

public class Question82 {
    static void displayLowerTriangleMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void displayLowerTriangleMatrixAlt(int[][] mat){
        int i=0,j;
        while(i<mat.length){
            j = 0;
            while(j<=i){
                System.out.print(mat[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        displayLowerTriangleMatrix(mat1);
        displayLowerTriangleMatrixAlt(mat1);
    }
}