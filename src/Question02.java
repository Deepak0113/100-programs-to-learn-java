public class Question02 {
    static void inpCharToZ(char start){
        for(char ch = start; ch<='Z'; ch++){
            System.out.print(ch);
        }
    }

    static void inpCharToZRecursion(char start){
        if(start == 'Z'+1){
            return;
        }

        System.out.print(start);
        char ch = (char) (start + 1);
        inpCharToZRecursion(ch);
    }

    public static void main(String[] args) {
//        inpCharToZ('M');
        inpCharToZRecursion('M');
    }
}