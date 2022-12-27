public class Question30 {
    static void largeOfThreeNumbers(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println(a);
            } else{
                System.out.println(c);
            }
        } else if(b>c){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        largeOfThreeNumbers(10,5,7);

    }
}