//99. Java Program to convert all small letter to capital letter without using special
//        functions.

public class Question99 {
    static String convertToUpper(String string){
        String res = "";
        int ascii;
        char ch;

        for(int i=0; i<string.length(); i++){
            ch = string.charAt(i);

            if(Character.isAlphabetic(ch) && Character.isLowerCase(ch)){
                ascii = (int) ch - 97 + 65;
                res += (char) ascii;
            } else{
                res += ch;
            }
        }

        return res;
    }

    static String convertToUpperAlt(String string){
        String res = "";
        int ascii, i=0;
        char ch;

        while(i<string.length()){
            ch = string.charAt(i);

            if(Character.isAlphabetic(ch) && Character.isLowerCase(ch)){
                ascii = (int) ch - 97 + 65;
                res += (char) ascii;
            } else{
                res += ch;
            }

            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        String string = "This is my value";
        System.out.println(convertToUpper(string));
        System.out.println(convertToUpperAlt(string));
    }
}