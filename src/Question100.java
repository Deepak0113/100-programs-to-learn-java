//100. Java Program to convert ASCHII value to character(for A-Z only) without
//        using special functio

public class Question100 {
    public static void main(String[] args) {
        int ascii = 97;
        if(65<=ascii && ascii>=90 || 97<=ascii && ascii>=122)
            System.out.println((char) ascii);
    }
}