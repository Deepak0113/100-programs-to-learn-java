//86.Java Program to print all the characters in an arrays.

public class Question86 {
    static void displayCharArrayAsString(char[] arr){
        for(char ch: arr){
            System.out.print(ch);
        }
        System.out.println();
    }

    static void displayCharArrayAsStringAlt(char[] arr){
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c'};
        displayCharArrayAsString(arr);
        displayCharArrayAsStringAlt(arr);
    }
}