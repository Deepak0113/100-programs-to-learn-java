public class Question48 {
    static void patternPascalTriangle_Reverse(int size){
        for(int i=0; i<size; i++){
            System.out.print(" ".repeat((size-i-1)*2));
            for(int j=size-i; j<size; j++){
                System.out.print(j+" ");
            }
            for(int j=size; j>=size-i; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternPascalTriangle_Reverse(9);

    }
}