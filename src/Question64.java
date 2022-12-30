import java.util.Arrays;

public class Question64 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int[] arrCopy = arr.clone();
        int[] arrAltCopy = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arrAltCopy[i] = arr[i];
        }

        arrAltCopy[0] = 10;
        arrCopy[0] = 10;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopy));
        System.out.println(Arrays.toString(arrAltCopy));

    }
}
