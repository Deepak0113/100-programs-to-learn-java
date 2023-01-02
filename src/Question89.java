//89.Java Program to convert a sentence/paragraph to word(String) array without
//using string function.

import java.util.ArrayList;
import java.util.Arrays;

public class Question89 {
    static String[] stringToStringArray(String string){
        String res = "";
        string = string.trim();
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) != ' '){
                res += string.charAt(i);
            } else{
                arrayList.add(res);
                res = "";
            }
        }
        arrayList.add(res);

        return arrayList.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String string  = "This is working!!";
        String[] stringArr = stringToStringArray(string);
        System.out.println(Arrays.toString(stringArr));
    }
}