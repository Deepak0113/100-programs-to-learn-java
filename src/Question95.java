//95.Java Program to find the given two strings are palindrome.

public class Question95 {
    static boolean isPalindrome(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        for(int i=0; i<string1.length(); i++){
            if(string1.charAt(i) != string2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "madam", s2 = "madam";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(isPalindrome(s1,s2));
    }
}