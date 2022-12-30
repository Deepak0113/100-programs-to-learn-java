public class Question61 {
    static void printArrayReverse(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        printArrayReverse(new int[]{1,2,3,4,5});
    }
}
