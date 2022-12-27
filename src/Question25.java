public class Question25 {
    static void getQuotientRemainder(int dividend, int divisor){
        System.out.println("Quotient: " + (dividend/divisor));
        System.out.println("Remainder: " + (dividend%divisor));
    }

    public static void main(String[] args) {
        getQuotientRemainder(10,6);
    }
}