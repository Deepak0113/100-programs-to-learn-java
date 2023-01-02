//88.Java Program to convert a sentence/paragraph to word(String) array with using
//        string function.

import java.util.Arrays;

public class Question88 {
    public static void main(String[] args) {
        String string  = "This is working!!";
        String[] stringArr = string.split(" ");
        System.out.println(Arrays.toString(stringArr));
    }
}