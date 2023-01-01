public class Question73 {
    static int[][] addMatrix(int[][] mat1, int[][] mat2){
        int row = mat1.length;
        int col = mat1[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat1[i][j] += mat2[i][j];
            }
        }

        return mat1;
    }

    static int[][] addMatrixAlt(int[][] mat1, int[][] mat2){
        int row = mat1.length;
        int col = mat1[0].length;
        int j=0, i=0;

        while(i<row){
            while(j<col){
                mat1[i][j] += mat2[i][j];
                j++;
            }
            i++;
        }

        return mat1;
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
        int[][] mat1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        displayMatrix(addMatrix(mat1, mat1));
        displayMatrix(addMatrixAlt(mat1, mat1));
    }
}