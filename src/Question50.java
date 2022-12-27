public class Question50 {
    static void patternFullTriangleInverted_NumberDecrease(int size){
        for(int i=size; i>0; i--){
            String space = " ".repeat(size-i);
            String line = space;
            line += (i+" ").repeat(i-1);
            line += i;
            line += space;
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        patternFullTriangleInverted_NumberDecrease(9);

    }
}