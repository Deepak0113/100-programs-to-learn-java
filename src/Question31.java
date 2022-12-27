public class Question31 {
    static void evaluatePolyEquation(int a, int b, int c){
        double root = Math.sqrt(b*b - 4*a*c);
        double x1 = (-b + root)/(2*a);
        double x2 = (-b - root)/(2*a);
        System.out.println("Roots:");
        System.out.println("x = " + x1);
        System.out.println("x = " + x2);
    }

    public static void main(String[] args) {
        evaluatePolyEquation(1,5,6);
    }
}