//71.Java Program to find the 2nd Smallest Number in an Array

import java.util.Arrays;

public class Question71 {
    static void min2nd(int[] arr){
        int min1 = arr[0], min2 = arr[0];

        for(int i=1; i<arr.length; i++){
            if(min1 > arr[i]){
                min2 = min1;
                min1 = arr[i];
            }
        }

        System.out.println("2nd Min: "+min2);
    }

    static void min2ndAlt(int[] arr){
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int max = sortedArr[1];

        System.out.println("2nd Max: "+max);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,4,5};
        min2nd(arr);
        min2ndAlt(arr);
    }
}
