public class Question21 {
    public static void main(String[] args) {
        int a = 10;
        int b = (++a * (a++ + 5));
        System.out.println(b); //176
    }
}