//96. Java program to find a character in a word string linear search.

public class Question96 {
    static int linearSearch(String string, char ch) {
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == ch)
                return i;
        }
        return -1;
    }

    static int linearSearchRecursion(String string, char ch, int i) {
        if(i == string.length()){
            return -1;
        }
        if(string.charAt(i) == ch){
            return i;
        }
        return linearSearchRecursion(string, ch, i+1);
    }

    public static void main(String[] args) {
        System.out.println(linearSearch("This", 's'));
        System.out.println(linearSearchRecursion("This", 'h', 0));
    }
}