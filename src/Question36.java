public class Question36 {
    static void printEvenPositions(int[] arr){
        for(int i=1; i<arr.length; i+=2){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        printEvenPositions(new int[]{1,2,3,4,5});

    }
}