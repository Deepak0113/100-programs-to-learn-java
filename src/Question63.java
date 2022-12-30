import java.util.Arrays;

public class Question63 {
    static void maxAndMinAlt(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }

    static void maxAndMin(int[] arr){
        int max=arr[0], min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,4,5};
        maxAndMin(arr);
        maxAndMinAlt(arr);
    }
}
