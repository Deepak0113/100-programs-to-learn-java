public class Question47 {
    static void patternPascalTriangle(int size){
        for(int i=1; i<=size; i++){
            System.out.print(" ".repeat((size-i)*2));
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternPascalTriangle(9);

    }
}