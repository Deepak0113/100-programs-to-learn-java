public class Question35 {
    static int factorial(int n){
        int res = 1;
        for(int i=n; i>=2; i--){
            res *= i;
        }

        return res;
    }

    static int sumOfDigits(int n){
        int res = 0;
        while(n!=0){
            res += n%10;
            n/=10;
        }

        return res;
    }

    static void factorialSumDigits(int n){
        int facto = factorial(n);
        int sum = sumOfDigits(facto);
        System.out.println("Factorial of "+n+" : "+facto);
        System.out.println("Sum of digits of "+facto+" : "+sum);
    }

    public static void main(String[] args) {
        factorialSumDigits(5);

    }
}