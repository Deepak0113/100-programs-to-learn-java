//90.Java Program to sort the words in ascending.

import java.util.Arrays;

public class Question90 {
    static String[] selectionSort(String[] words, int[] arr){
        int len = arr.length;
        int minInd, temp;
        String tempch;

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

            tempch = words[minInd];
            words[minInd] = words[i];
            words[i] = tempch;
        }

        return words;
    }

    static String sortWords(String sentence){
        String[] arr = sentence.split(" ");
        int[] valArr = new int[arr.length];
        int len = arr.length, val;

        for(int i=0; i<len; i++){
            val = 0;
            for(int j=0; j<arr[i].length(); j++){
                val += arr[i].charAt(j);
            }
            valArr[i] = val;
        }

        return String.join(" ",selectionSort(arr,valArr));
    }

    public static void main(String[] args) {
        String sentence = "This is value";
        System.out.println(sortWords(sentence));
    }
}