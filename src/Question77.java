//77.Java Program to sort the elements of an array in ascending order

import java.util.Arrays;

public class Question77 {
    // selection sort
    static void selectionSort(int[] arr){
        int len = arr.length;
        int minInd, temp;

        for(int i=0; i<len-1; i++){
            minInd = i;
            for(int j=i+1; j<len; j++){
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
            }

            temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // insertion sort
    static void insertionSort(int[] arr){
        int len = arr.length;

        for(int i=1; i<len; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    // merge sort
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int m = l + (r-l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    // bubble sort
    static void bubbleSort(int arr[]) {
        int len = arr.length, temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // quick sort
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        selectionSort(arr);
        insertionSort(arr);
        bubbleSort(arr);

        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}