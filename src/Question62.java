//62.Java Program to print the elements of an array present on even position and odd
//        positions

public class Question62 {
    static void printEvenOddPosition(int[] arr){
        System.out.print("Odd Position: ");
        for(int i=0; i<arr.length; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Even Position: ");
        for(int i=1; i<arr.length; i+=2){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        printEvenOddPosition(new int[]{1,2,3,4,5});
    }
}
