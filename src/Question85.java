//85.Java Program to find the sum of each row and each column of a matrix

public class Question85 {
    static void rowColSum(int[][] arr){
        int sumRow=0, sumCol=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sumRow += arr[i][j];
                sumCol += arr[j][i];
            }
        }

        System.out.println("Row Sum: "+sumRow);
        System.out.println("Column Sum: "+sumCol);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        rowColSum(arr);
    }
}