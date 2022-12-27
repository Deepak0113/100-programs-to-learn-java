public class Question19 {
    public static void main(String[] args) {
        int a;
        a=28;
        a+=a++ + ++a + -a + a;
        System.out.println(a); //86
    }
}