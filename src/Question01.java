public class Question01 {
    // multiplication table using iteration
    static void multiplicationTable(int n, int m){
        System.out.println("Multiplication Table");
        for(int i=1; i<=m; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    // subtraction table using iteration
    static void subtractionTable(int n, int m){
        System.out.println("Subtraction Table");
        for(int i=1; i<=m; i++){
            System.out.println(n+" - "+i+" = "+(n-i));
        }
    }

    // multiplication table using recursion
    static void multiplicationTableRecursive(int n, int m){
        if(m==0){
            return;
        }

        multiplicationTableRecursive(n,m-1);
        System.out.println(n+" x "+m+" = "+(n*m));
    }

    // subtraction table using recursion
    static void subtractionTableRecursion(int n, int m){
        if(m == 0){
            return;
        }

        subtractionTableRecursion(n,m-1);
        System.out.println(n+" - "+m+" = "+(n-m));
    }

    public static void main(String[] args) {
        multiplicationTable(9,10);
        subtractionTable(9,10);
        multiplicationTableRecursive(9,10);
        subtractionTableRecursion(9,10);
    }
}
