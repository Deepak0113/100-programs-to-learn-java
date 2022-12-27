public class Question05 {
    static void pattern1(char start){
        for(char ch = start; ch>='A'; ch--){
            int rep = ch - 'A' + 1;
            while(rep>0){
                System.out.print(ch);
                rep--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1('E');
    }
}
