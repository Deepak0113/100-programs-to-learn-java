public class Question23 {
    public static void main(String[] args) {
        int a=5;
        int b = a++ - a++ + -a;
        System.out.println(b); //-8
    }
}