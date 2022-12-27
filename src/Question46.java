public class Question46 {
    static void rotateArrayRight(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        rotateArrayRight(new int[]{1,2,3,4,5});

    }
}