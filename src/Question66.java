//66.Java Program to left rotate the elements of an array

public class Question66 {
    static void rotateArrayLeft(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    static void rotateArrayLeftAlt(int[] arr){
        int temp = arr[0], i=1;
        while(i<arr.length){
            arr[i-1] = arr[i];
            i++;
        }
        arr[arr.length-1] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rotateArrayLeft(new int[]{1,2,3,4,5});
        rotateArrayLeftAlt(new int[]{1,2,3,4,5});
    }
}
