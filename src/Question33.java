public class Question33 {
    static void checkAlpha(char character){
        System.out.println(Character.isAlphabetic(character) ? "Alphabet" : "Not Alphabet");
    }

    public static void main(String[] args) {
        checkAlpha('C');

    }
}