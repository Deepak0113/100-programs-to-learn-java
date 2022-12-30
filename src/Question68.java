import java.util.Arrays;

public class Question68 {
    static int sumOfItemsArray(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }

        return sum;
    }

    static int sumOfItemsArrayAlt(int[] arr){
        return Arrays.stream(arr).sum();
    }

    static int sumArrayRecursion(int[] arr, int i){
        if(i == arr.length-1){
            return arr[i];
        }

        return arr[i] + sumArrayRecursion(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(sumOfItemsArray(arr));
        System.out.println(sumOfItemsArrayAlt(arr));
        System.out.println(sumArrayRecursion(arr,0));
    }
}