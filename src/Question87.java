//87.Java Program to convert char array to string without using toString() method.

public class Question87 {
    static String getCharArrayToString(char[] arr){
        String str = "";
        for(char ch: arr){
            str += ch;
        }

        return str;
    }

    static String getCharArrayToStringAlt(char[] arr){
        return new String(arr);
    }

    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c'};
        System.out.println(getCharArrayToString(arr));
        System.out.println(getCharArrayToStringAlt(arr));
    }
}