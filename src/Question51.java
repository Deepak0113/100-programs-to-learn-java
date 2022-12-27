public class Question51 {
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
        System.out.println(reverseNumber(12345));

    }
}