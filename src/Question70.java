import java.util.Arrays;

public class Question70 {
    static void max2nd(int[] arr){
        int max1 = arr[0], max2 = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            }
        }

        System.out.println("2nd Max: "+max2);
    }

    static void max2ndAlt(int[] arr){
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int max = sortedArr[arr.length - 2];

        System.out.println("2nd Max: "+max);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,4,5};
        max2nd(arr);
        max2ndAlt(arr);
    }
}