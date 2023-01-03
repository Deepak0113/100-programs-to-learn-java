//92.Java Program to sort the words in ascending using recursion

import java.util.Arrays;

public class Question92 {
    static void merge(String[] arr, int start, int mid, int right){
        int len1 = mid - start + 1;
        int len2 = right - mid;

        String[] arr1 = new String[len1];
        String[] arr2 = new String[len2];

        for(int i=0; i<len1; i++){
            arr1[i] = arr[start + i];
        }

        for(int i=0; i<len2; i++){
            arr2[i] = arr[mid + i + 1];
        }

        int i=0, j=0, k=start;

        while(i<len1 && j<len2){
            System.out.println("Checking:   "+arr1[i]+"  "+arr2[j]+"  "+arr1[i].compareTo(arr2[j]));
            if(arr1[i].compareTo(arr2[j]) <= 0){
                arr[k++] = arr1[i++];
            } else if(arr1[i].compareTo(arr2[j]) > 0){
                arr[k++] = arr2[j++];
            } else{
                arr[k++] = arr1[i++];
                arr[k++] = arr2[j++];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        while(i<arr1.length){
            arr[k++] = arr1[i++];
        }

        while(j<arr2.length){
            arr[k++] = arr2[j++];
        }
    }

    static void mergeSort(String[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        String word = "Working on my project";
        String[] arr = word.split(" ");

        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


        System.out.println("a".compareTo("A"));
    }
}