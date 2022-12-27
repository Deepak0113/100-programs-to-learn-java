public class Question03 {
    static void subtractFromReverse(int n){
        int nReverse = reverseNumber(n);
        System.out.println(n - nReverse);
    }

    static int reverseNumber(int n){
        int res = 0, mod;
        while(n!=0){
            mod = n%10;
            n /= 10;
            res = res*10 + mod;
        }

        return res;
    }

    public static void main(String[] args) {
        subtractFromReverse(123);
    }
}
