//91.Java Program to sort the characters in a word in descending.

import java.util.Arrays;
import java.util.Collections;

public class Question91 {
    static char[] selectionSortDesc(char[] arr){
        int len = arr.length;
        int minInd;
        char temp;

        for(int i=0; i<len-1; i++){
            minInd = i;
            for(int j=i+1; j<len; j++){
                if(arr[minInd] < arr[j]){
                    minInd = j;
                }
            }

            temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    static String sortReverse(char[] arr){
        Arrays.sort(arr);
        String str = new String(arr);
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String word = "This";
        char[] arr = word.toCharArray();
        System.out.println(sortReverse(arr));
        System.out.println(new String(selectionSortDesc(arr)));
    }
}