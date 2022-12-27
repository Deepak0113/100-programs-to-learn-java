public class Question49 {
    static void patternFullTriangleInverted_Char(char ch, int size){
        for(int i=size; i>0; i--){
            String space = " ".repeat(size-i);
            String line = space;
            line += (ch+" ").repeat(i-1);
            line += ch;
            line += space;
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        patternFullTriangleInverted_Char('*', 9);

    }
}