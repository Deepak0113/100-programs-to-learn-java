public class Question04 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 7;
        System.out.println(n1 & n2); // 1010 & 0111 = 0010 (2)
        System.out.println(n1 | n2); // 1010 | 0111 = 1111 (15)
        System.out.println(n1 ^ n2); // 1010 ^ 0111 = 1101 (13)
        System.out.println(~n2); // ~0111 = 1000 (-8)
        System.out.println(n1 >> 2); // 1010 >> 2 = 0010 (2)
        System.out.println(-8 >> 2); // (-2)
        System.out.println(n2 << 2); // 0111 << 2 = 011100 (28)
        System.out.println(n1 >>> 2); // 1010 >>> 2 = 0010 (2)
    }
}
