public class Question43 {
    static void rotateArrayLeft(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int n: arr){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        rotateArrayLeft(new int[]{1,2,3,4,5});

    }
}