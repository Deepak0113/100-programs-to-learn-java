import java.util.Arrays;

public class Question54 {
    static void arrayPositionOrder(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i+=2){
            for(int j=i+2; j<arr.length; j+=2){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=1; i<arr.length; i+=2){
            for(int j=i+2; j<arr.length; j+=2){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        arrayPositionOrder(new int[]{13,2,4,15,12,10,5});

    }
}