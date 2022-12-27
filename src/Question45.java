public class Question45 {
    static void sumOfArrayElements(int[] arr) {
        int sum = 0;
        for(int n: arr){
            sum+=n;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfArrayElements(new int[]{1,2,3,4,5});

    }
}