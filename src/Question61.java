//61.Java Program to print the elements of an array in reverse order

public class Question61 {
    static void printArrayReverse(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    static void printArrayReverseAlt(int[] arr){
        int i=arr.length-1;
        while(i>=0){
            System.out.print(arr[i--]+" ");
        }
    }

    public static void main(String[] args) {
        printArrayReverse(new int[]{1,2,3,4,5});
        printArrayReverseAlt(new int[]{1,2,3,4,5});
    }
}
