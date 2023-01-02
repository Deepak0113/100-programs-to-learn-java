public class Question79 {
    static boolean isIdentityMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        return false;
                    }
                } else if(arr[i][j]!=0){
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isIdentityMatrixAlt(int[][] arr){
        int i=0, j=0;
        while(i<arr.length){
            while(j<arr[0].length){
                if(i==j){
                    if(arr[i][j]!=1){
                        return false;
                    }
                } else if(arr[i][j]!=0){
                    return false;
                }

                j++;
            }
            i++;
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
                {1,1,0},
                {0,1,0},
                {0,0,1}
        };
        System.out.println(isIdentityMatrix(mat1));
        System.out.println(isIdentityMatrix(mat2));
    }
}