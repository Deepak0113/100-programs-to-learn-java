public class Question55 {
    static void patternAlphaCStar(int size){
        System.out.println("*".repeat(size));
        for(int i=0; i<size-2; i++){
            System.out.println("*");
        }
        System.out.println("*".repeat(size));
    }

    public static void main(String[] args) {
        patternAlphaCStar(4);

    }
}