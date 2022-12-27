public class Question18 {
    public static void main(String[] args) {
        int a,b;
        a=10; b=5;
        System.out.println(++a-b); //6
        a=10; b=5;
        System.out.println(a%b++); //0
        a=10; b=5;
        System.out.println(a*=b+5); //100
        System.out.println(69>>>2); //17
    }
}