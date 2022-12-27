import java.util.Arrays;

public class Question41 {
    public static void main(String[] args) {
         int[] arr1 = new int[]{1,2,3,4,5};
         int[] arr2 = arr1.clone();
         arr1[0] = 100;
         System.out.println(Arrays.toString(arr1));
         System.out.println(Arrays.toString(arr2));
    }
}