public class Question29 {
    static void isVowelConsonant(char alphabet){
        char ch = Character.toLowerCase(alphabet);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        } else{
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        isVowelConsonant('A');

    }
}