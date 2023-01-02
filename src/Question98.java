//98. Java Program to print the print the equivalent Capital letter of a given small letter
//        in Alphabets.

public class Question98 {
    public static void main(String[] args) {
        char ch = 'a';
        if(Character.isAlphabetic(ch)){
            System.out.println((char) ((int) ch - 97 + 65));
            System.out.println(Character.toUpperCase(ch));
        }
    }
}