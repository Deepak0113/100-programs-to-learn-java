//83.Java Program to display the upper triangular matrix

public class Question83 {
    static void displayUpperTriangleMatrix(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(j>=i){
                    System.out.print(mat[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void displayUpperTriangleMatrixAlt(int[][] mat){
        int i=0,j;
        while(i<mat.length){
            j = 0;
            while(j<mat[0].length){
                if(j>=i){
                    System.out.print(mat[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        displayUpperTriangleMatrix(mat1);
        displayUpperTriangleMatrixAlt(mat1);
    }
}