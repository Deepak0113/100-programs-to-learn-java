//69.Java Program to rotate the elements of an array in the right direction

public class Question69 {
    static void rotateArrayRight(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    static void rotateArrayRightAlt(int[] arr){
        int temp = arr[arr.length-1];
        int i=arr.length-2;
        while(i>=0){
            arr[i+1] = arr[i];
            i--;
        }
        arr[0] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rotateArrayRight(new int[]{1,2,3,4,5});
        rotateArrayRightAlt(new int[]{1,2,3,4,5});
    }
}
